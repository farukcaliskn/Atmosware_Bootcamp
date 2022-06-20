function numberEntry() {
    var number = prompt("Bitiş sayısını giriniz : ");
    if (number <= 1) {
        alert("Girilen sayı 1'den büyük olmalıdır.")
        return numberEntry();
    }
    else return number;
}

var sum = 0, counter = 0;
var even = 0, evenSum = 0, evenNumber = 0;
var odd = 0, oddSum = 0, oddNumber = 0;

function calculate() {


    for (var i = 1; i <= number; i++) {
        if (number === 44) {
            alert(number + ' SecretKey Girildi Programdan Çıkıldı')
            break
        }
        if (i === 100) {
            alert('Sayı:' + number + ' 100 den büyük sayılar 100 e kadar hesaplanır.')
            break;
        }

        if (i === 7) {
            alert('Sayı:' + i + ' sayısı dahil edilmedi.')
            continue
        }

        if (i % 2 == 0) {
            evenSum += i
            even++
            evenNumber = String(evenNumber).concat('-' + i)
        }


        if (i % 2 == 1) {
            oddSum += i
            odd++
            oddNumber = String(oddNumber).concat('-' + i)
        }
        counter++;
        sum += i;
    }
}

number = numberEntry();
calculate();
document.write('<br>' + 'verilen Sayı: ' + number)
document.write('<br>' + 'verilen Sayı Adedi: ' + counter)
document.write('<br>' + 'verilen Sayı Toplamı: ' + sum + '<br>')

document.write('<br>' + 'çift Sayı adeti: ' + even)
document.write('<br>' + 'çift Sayı toplamı: ' + evenSum)
document.write('<br>' + 'çift Sayı nelerdir: ' + evenNumber + '<br>')

document.write('<br>' + 'tek Sayı adeti: ' + odd)
document.write('<br>' + 'tek Sayı toplamı: ' + oddSum)
document.write('<br>' + 'tek Sayı nelerdir: ' + oddNumber)