var date = new Date().getDay()
let show = function (date) {
    switch (date) {
        case 0:
            document.write("Günlerden Pazar")
            break;
        case 1:
            document.write("Günlerden Pazartesi")
            break;
        case 2:
            document.write("Günlerden Salı")
            break;
        case 3:
            document.write("Günlerden Çarşamba")
            break;
        case 4:
            document.write("Günlerden Perşembe")
            break;
        case 5:
            document.write("Günlerden Cuma")
            break;
        case 6:
            document.write("Günlerden Cumartesi")
            break;
        default:

    }
};

show(date);

