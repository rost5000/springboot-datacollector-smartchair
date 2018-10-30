var load_data_magnetometer = function(people){

var x = [];
var y = [];
var z = [];
$.ajax({
    url:"/api/plot",
    type: "post",
    data:{
        table: "magnetometer",
        people: people
    }
}).then(function(dates) {
    dates.forEach(function(data){
        x.push({x:data["x"], y: data["id"]});
        y.push({x:data["y"], y: data["id"]});
        z.push({x:data["z"], y: data["id"]});
    });
});

return [x, y, z];
}

var load_data_accelerometer = function(people){

var x = [];
var y = [];
var z = [];
$.ajax({
    url:"/api/plot",
    type: "post",
    data:{
        table: "accelerometer",
        people: people
    }
}).then(function(dates) {
    dates.forEach(function(data){
        x.push({y:data["ax"], x: data["id"]});
        y.push({y:data["ay"], x: data["id"]});
        z.push({y:data["az"], x: data["id"]});
    });
});

return [x, y, z];
}

var load_data = function(people, type){
    if(type == "magnetometer")
        return load_data_magnetometer(people);
    else if(type == "accelerometer")
        return load_data_accelerometer(people);
    else return null;
};