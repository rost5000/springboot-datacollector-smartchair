var load_charts = function(data, chart_name, parameters){
    var chart = new CanvasJS.Chart(chart_name,{
        title :{
            text: "tittle" in parameters? parameters["tittle"]:"Default Title"
        },
        axisX: {
            title: "axis_x" in parameters? parameters["axis_x"]:"Default axis x"
        },
        axisY: {
            title: "Units"
        },
        data: [{
            type: "line",
            dataPoints : data
        }]
      });
      chart.render()
      return chart;
};