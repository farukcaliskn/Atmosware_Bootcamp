function checkPassword(password, repassword) {
    var password = prompt("Parolanızı giriniz : ")
    var repassword = prompt("Parolanızı tekrar giriniz : ")
    if (password === repassword) {
        return "Şifreleriniz aynı sisteme giriş yaptınız."
    } else {
        alert("Şifreleri birbirinden farklı girdiniz tekrar deneyin. ")
        return checkPassword(password, repassword)
    }
}
document.write(checkPassword())