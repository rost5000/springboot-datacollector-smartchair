var dataPoints = [[{}]];
var fetchajax = function() {
    $.ajax({
        url: "/api/test2"
    }).then(function(dates) {


        var i = 0;
        dates.forEach(function(data){
            var j = 0;
            data.forEach(function(d){
                dataPoints[i][j] = {x: parseInt(d.x),
                                        y: parseInt(d.x)};
                 j = j + 1;
            });
            i = i + 1;
        });//*/
       //$('#feedback').html(dataPoints);
    });
};