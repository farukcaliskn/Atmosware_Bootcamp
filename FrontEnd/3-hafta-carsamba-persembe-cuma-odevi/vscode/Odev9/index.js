
function checkUser(userEmailData, userPasswordData) {
    let dbUserEmail = "deneme@gmail.com"
    let dbUserPassword = "root"
    for (let index = 1; index < 5; index++) {

        let userEmailData = prompt("Kullanıcı mailinizi giriniz : ")
        let userPasswordData = prompt("Kullanıcı şifrenizi giriniz : ")

        if (userEmailData == dbUserEmail && userPasswordData == dbUserPassword) {
            return adminFunction((index))
        } else if (index == 4) {
            document.write("Kullanıcı bloke oldu.")
        } else {
            alert("Girilen bilgiler yanlış. Tekrar deneyiz. Son " + (4-index) + " Hak")
        }

    }


}
function adminFunction(again) {
    document.write("Giriş başarılı. Parolayı "+again+". denemede doğru girdiniz.")
}
checkUser()