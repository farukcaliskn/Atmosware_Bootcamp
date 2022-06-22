var word = prompt("Bir kelime giriniz : ");

document.write("Harf sayısı : " + word.length + "<br>")
document.write("Trimlenmiş harf sayısı : " + word.trim().length + "<br>")
document.write("Hepsi küçük harf : " + word.toLowerCase() + "<br>")
document.write("Hepsi büyük harf : " + word.toUpperCase() + "<br>")
document.write("İlk karakter : " + word.charAt("0") + "<br>")
document.write("Kelime java ile başlıyormu : " + word.startsWith('java') + "<br>")
document.write("Sonuna kelime eklendi : " + word.concat(" -ben js ogreniyorum") + "<br>")
document.write("İlk 4 karakter : " + word.substring(0, 4) + "<br>") 

var replaceWord = prompt("Degistirmek istediginiz kelimeyi giriniz : ");
var newWord = prompt("Yerine eklemek istediğiniz kelimeyi giriniz : ")

document.write("replace : " + word.replace(replaceWord, newWord) + "<br>")