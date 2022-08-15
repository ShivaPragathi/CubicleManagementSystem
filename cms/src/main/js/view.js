const request = new XMLHttpRequest();
const url = 'http://localhost:8080/cubicles';
request.open("GET", url);
request.send();

request.onload = (e) => {
    alert(request.response);
}

var button = document.createElement("button");
button.innerHTML = "Do Something";