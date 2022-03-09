function findThirdLargest(){

    const numSeries = "4 5 9 3 7 1 8";

    const numberArr = numSeries.split(" ");

    console.log("Given Series: "+numberArr);

    for(let i = 0;i < numberArr.length - 1;i++){

        for(let j = 0;j < numberArr.length - i - 1;j++){

            if(numberArr[j] > numberArr[j+1]){

                let tempVal = numberArr[j];
                numberArr[j] = numberArr[j+1];
                numberArr[j+1] = tempVal;

            }

        }

    }

    console.log("Third Largest Number for the given Series is: "+numberArr[2]);

}

findThirdLargest();