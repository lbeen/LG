<template>
    <div class="t_container">
        <div v-for="row in boxes">
            <div v-for="box in row" class="t_box" :style="box.boxStyle">
                <header class="t_title">
                    <span>{{ box.title }}</span>
                </header>
                <div v-if="box.type === 'echarts'" :id="box.id" :style="box.eleStyle"></div>
                <div v-else-if="box.type === 'rollTable'" :id="box.id" class="main_table" :style="box.eleStyle">
                    <table>
                        <thead>
                        <tr>
                            <th v-for="head in box.heads">{{ head }}</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-for="line in box.tableData" :style="line.trTyle">
                            <td v-for="obj in line.data">{{ obj }}</td>
                        </tr>
                        <tr v-if="box.fixTail" :style="box.tailData.trTyle">
                            <td v-for="obj in box.tailData.data">{{ obj }}</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div v-else :id="box.id"></div>
            </div>
        </div>
    </div>
</template>

<script>
module.exports = {
    name: 'kanban',
    props: {
        conf: {
            type: Array,
            default: []
        }
    },
    data() {
        return {
            boxes: [],
            colors: ['#C1232B', '#B5C334', '#FCCE10', '#E87C25', '#27727B', '#FE8463', '#9BCA63', '#FAD860', '#F3A43B',
                '#60C0DD', '#D7504B', '#C6E579', '#F4E001', '#F0805A', '#26C0C0']
        }
    },
    created() {
        for (let i = 0; i < this.conf.length; i++) {
            const row = this.conf[i];

            const rowBox = []
            for (let j = 0; j < row.length; j++) {
                const box = {
                    id: 'box_' + i + j,
                    boxStyle: {
                        width: '0px',
                        height: '0px',
                        marginLeft: '0px',
                        marginTop: '0px'
                    },
                    eleStyle: {
                        height: '0px'
                    }
                }
                for (let key in row[j]) {
                    box[key] = row[j][key]
                }
                if (!box.interval) {
                    box.interval = 60000
                }
                if (box.type === 'echarts') {
                    if (!box.echartsType) {
                        box.echartsType = 'bar'
                    }
                } else if (box.type === 'rollTable') {
                    box.heads = []
                    box.allData = []
                    box.tableData = []
                    box.tailData = []
                    box.scrollIndex = 0
                }
                rowBox.push(box)
            }
            this.boxes.push(rowBox)
        }
    },
    mounted() {
        this.changeBoxSize()
        this.$nextTick(() => {
            for (let i = 0; i < this.boxes.length; i++) {
                const row = this.boxes[i];
                for (let j = 0; j < row.length; j++) {
                    const box = row[j]
                    box.element = document.getElementById(box.id)
                    if (box.type === 'echarts') {
                        box.echarts = echarts.init(box.element)
                        this.initEcharts(box)
                        window.setInterval(() => this.initEcharts(box), box.interval)
                    } else if (box.type === 'rollTable') {
                        this.initTable(box)
                        window.setInterval(() => this.initTable(box), box.interval)
                    }
                }
            }
        })
        window.onresize = () => {
            this.changeBoxSize()
            this.$nextTick(() => {
                for (let i = 0; i < this.boxes.length; i++) {
                    const row = this.boxes[i];
                    for (let j = 0; j < row.length; j++) {
                        const box = row[j]
                        if (box.type === 'echarts') {
                            box.echarts.resize()
                        } else if (box.type === 'rollTable') {
                            this.resetTable(box)
                        }
                    }
                }
            })
        }
    },
    methods: {
        changeBoxSize() {
            const containerHeight = window.innerHeight - 5
            for (let y = 0; y < this.boxes.length; y++) {
                const row = this.boxes[y];
                const containerWidth = window.innerWidth - 5
                for (let x = 0; x < row.length; x++) {
                    const box = row[x]

                    const width = containerWidth / 24 * box.width
                    const height = containerHeight / 24 * box.height
                    box.boxStyle.width = width + 'px'
                    box.boxStyle.height = height + 'px'
                    if (x === 0) {
                        box.boxStyle.marginLeft = '5px'
                    }
                    if (y === 0) {
                        box.boxStyle.marginTop = '5px'
                    }
                    box.eleStyle.height = height - 35 + 'px'
                }
            }
        },
        initEcharts(box) {
            this.$http.get(box.url).then(res => {
                const data = res.body.data
                if (box.echartsType === 'line' || box.echartsType === 'bar') {
                    this.initEchartsBar(box, data)
                } else if (box.echartsType === 'pie') {
                    this.initEchartsPie(box, data)
                }
            }, () => console.log('请求失败处理'))
        },
        initEchartsBar(box, data) {
            const series = []
            for (let i = 0, len = data.legends.length; i < len; i++) {
                series.push({
                    name: data.legends[i],
                    itemStyle: {
                        normal: {
                            label: {
                                show: true,
                                position: 'top',
                                textStyle: {
                                    color: 'white',
                                    fontSize: 16
                                }
                            },
                            color: this.colors[i],
                            shadowBlur: 20,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    },
                    type: box.echartsType,
                    data: data.yData[i]
                })
            }

            const option = {
                tooltip: {
                    show: true
                },
                legend: {
                    data: data.legends,
                    textStyle: {
                        color: 'white',
                        fontSize: 16
                    }
                },
                xAxis: {
                    type: 'category',
                    data: data.xData,
                    axisLabel: {
                        textStyle: {
                            color: 'white'
                        }
                    },
                    axisLine: {
                        show: true,
                        lineStyle: {
                            color: '#6173A3'
                        }
                    },
                },
                yAxis: {
                    type: 'value',
                    splitLine: {show: false},
                    axisLabel: {
                        textStyle: {
                            color: '#9ea7c4',
                            fontSize: 12
                        }
                    },
                    axisLine: {
                        show: true,
                        lineStyle: {
                            color: '#6173A3'
                        }
                    }
                },
                series: series
            }
            box.echarts.setOption(option)
        },
        initEchartsPie(box, data) {
            const option = {
                tooltip: {
                    show: true
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    textStyle: {
                        color: 'white',
                    },
                    formatter: function (name) {
                        for (let i = 0; i < data.length; i++) {
                            if (data[i].name === name) {
                                return name + ' ' + data[i].value
                            }
                        }
                        return name
                    }
                },
                color: this.colors,
                series: [{
                    label: {
                        normal: {
                            show: true,
                            color: 'white',
                            position: 'inner',
                            formatter: '{d}'
                        }
                    },
                    type: 'pie',
                    data: data
                }]
            }
            box.echarts.setOption(option)
        },
        initTable(box) {
            this.$http.get(box.url).then(res => {
                const data = res.body.data
                box.heads = data.heads

                const newAllData = data.list
                const newLen = newAllData.length

                box.allData = []
                if (this.needResetTable(box, newAllData)) {
                    for (let i = 0; i < newLen; i++) {
                        const line = {
                            id: newAllData[i][0],
                            data: newAllData[i]
                        }
                        if (i % 2 === 0) {
                            line.trTyle = {}
                        } else {
                            line.trTyle = {
                                width: '98%',
                                backgroundColor: '#2B3AA8',
                                boxShadow: '-10px 0 15px #2C58A6 inset, 10px 0 15px #2C58A6 inset'
                            }
                        }

                        if (box.fixTail && i === newLen - 1) {
                            line.trTyle.backgroundColor = 'rgb(94 102 156)'
                            box.tailData = line
                        } else {
                            box.allData.push(line)
                        }
                    }
                    this.resetTable(box)
                } else {
                    for (let i = 0; i < newLen; i++) {
                        if (box.fixTail && i === newLen - 1) {
                            box.tailData = newAllData[i]
                        } else {
                            box.allData[i].data = newAllData[i]
                        }
                    }
                }
            }, () => console.log('请求失败处理'))
        },
        needResetTable(box, newAllData) {
            const newLen = newAllData.length
            let oldLen = box.allData.length
            if (box.fixTail) {
                oldLen -= 1
            }
            if (newLen === 0 || oldLen === 0 || newLen !== oldLen) {
                return true
            }
            for (let i = 0; i < newLen; i++) {
                if (newAllData[i][0] !== box.allData[i].id) {
                    return true
                }
            }
            return false
        },
        resetTable(box) {
            const tbodyHeight = box.element.parentNode.offsetHeight - 100
            let dataLen = box.allData.length;
            if (box.fixTail) {
                dataLen += 1
            }
            let trHeight = tbodyHeight / dataLen
            if (trHeight > 40) {
                if (box.scrollTimer) {
                    window.clearInterval(box.scrollTimer)
                }
                for (let i = 0, len = box.allData.length; i < len; i++) {
                    box.allData[i].trTyle.height = trHeight + 'px'
                }
                box.tableData = box.allData
                if (box.fixTail) {
                    box.tailData.trTyle.height = trHeight + 'px'
                }
                return
            }

            for (let i = 0, len = box.allData.length; i < len; i++) {
                box.allData[i].trTyle.height = '40px'
            }
            if (box.fixTail) {
                box.tailData.trTyle.height = '40px'
            }
            let trShowCount = parseInt((tbodyHeight / 40).toString())
            if (box.fixTail) {
                trShowCount -= 1
            }
            box.tableData = box.allData.slice(0, trShowCount)
            box.scrollIndex = trShowCount - 1
            this.scrollTable(box)
        },
        scrollTable(box) {
            if (box.scrollTimer) {
                window.clearInterval(box.scrollTimer)
            }
            box.scrollTimer = window.setInterval(() => {
                box.scrollIndex = box.scrollIndex < box.allData.length - 1 ? (box.scrollIndex + 1) : 0
                box.tableData.shift()
                box.tableData.push(box.allData[box.scrollIndex])
            }, 5000)
        }
    },
}
</script>