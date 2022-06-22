var temperature = prompt("Hava kaç derece : ")

function calculate(temperature) {
    return (temperature * (9 / 5) + 32)
}

document.write(temperature + "°C = " + calculate(temperature) + "℉")