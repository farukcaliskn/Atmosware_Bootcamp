var data = prompt("Bir kelime giriniz")

var deleted = data.substring(1, data.length - 1);
for (var i = 1; i < deleted.length + 1; i++) {
    data = data.replace(data.substring(i, i + 1), "*")
}
document.write(data + "<br>")