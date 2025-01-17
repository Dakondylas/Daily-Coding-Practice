
document.getElementById("submitButton").addEventListener("click", function() {
    let isNotPrime = false;
    let divisibleBy = "";
    console.log(document.getElementById("inputText").value)
    let input = document.getElementById("inputText")
    if (isNaN(input.value) || input.value == "") {
        document.getElementById("inputText").value = ""
        window.alert("Please Enter a Number.");
    } else {
        if (Number(input.value) < 1) {
            if (input.value == "0") {
                window.alert("Don't put 0...")
                document.getElementById("inputText").value = ""
            } else {
                window.alert("Please Enter at least 1...")
                document.getElementById("inputText").value = ""
            }
        } else {
            if (Number(input.value) == 1) {
                document.getElementById("output").style.display = 'block';
                document.getElementById("output").innerHTML = `Yes ${input.value} is Prime\n\nIt is only divisible by 1 and itself (${input.value})`
            } else {
               for (x=2; x<Number(input.value); x++) {
                    if (Number(input.value)%x == 0) {
                        if (isNotPrime) {
                            divisibleBy += `, ${x}`;
                        } else {
                            divisibleBy += `${x}`;
                        };
                        isNotPrime = true;
                    }
                }
                if (isNotPrime) {
                    document.getElementById("output").style.display = 'block';
                    document.getElementById("output").innerHTML = `No ${input.value} is Not Prime\n\nIt is divisible by ${divisibleBy}` 
                } else {
                    document.getElementById("output").style.display = 'block';
                    document.getElementById("output").innerHTML = `Yes ${input.value} is Prime\n\nIt is only divisible by 1 and itself (${input.value})`
                }
            } 
        }
    }
});
