var number = prompt("Bir sayi giriniz : ")

function positiveOrNegative(number) {
    if (number < 0) {
        return "Negatif"
    } else {
        return "Pozitif"
    }
}

document.write(number+" sayısı "+positiveOrNegative(number)+" bir sayıdır.")
