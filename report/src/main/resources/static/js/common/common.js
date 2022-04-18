/**
 * get请求
 */
Vue.prototype.ajaxGet = function (url, param, success, error) {
    this.$http.get(url, {params: param}).then(response => this.handleResult(response.body, success, error), () => {
        this.showError('操作失败')
        if (error) {
            error()
        }
    })
}
/**
 * get请求
 */
Vue.prototype.ajaxPost = function (url, param, success, error) {
    this.$http.post(url, param, {emulateJSON: true}).then(response => this.handleResult(response.body, success, error), () => {
        this.showError('操作失败')
        if (error) {
            error()
        }
    })
}
/**
 * 请求结果处理
 */
Vue.prototype.handleResult = function (result, success, error) {
    if (!result) {
        this.showError('操作失败')
        if (error) {
            error()
        }
        return
    }
    if (result.code !== 0) {
        this.showError(result.msg)
        if (error) {
            error(result)
        }
        return
    }
    if (result.msg) {
        this.showSuccess(result.msg)
    }
    if (success) {
        success(result)
    }
}
/**
 * 弹出错误提示
 */
Vue.prototype.showError = function (msg) {
    this.$message({
        message: msg,
        type: 'error',
        showClose: true
    })
}
/**
 * 弹出成功提示
 */
Vue.prototype.showSuccess = function (msg) {
    this.$message({
        message: msg,
        type: 'success',
        showClose: true
    })
}
/**
 * 验证字段
 */
Vue.prototype.checkFieldEmpty = function (value, label) {
    if (value) {
        return false;
    }
    this.showError(label + '为必填项')
    return true
}
function getUrlParam(key) {
    const arr = window.location.search.substring(1).split('&');
    for (let i = 0; i < arr.length; i++) {
        const kv = arr[i].split("=");
        if (kv[0] === key) {
            return kv[1]
        }
    }
    return ''
}
