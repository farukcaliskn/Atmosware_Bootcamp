var password = "1234560aaA";

function validate() {
    var validationPassword = prompt("Şifrenizi giriniz : ")
    if (password == validationPassword) {
        alert("Şifreniz doğru...")
    } else {
        alert("Şifreniz yanlış. Lütfen tekrar deneyin")
        return validate();
    }
}

validate();