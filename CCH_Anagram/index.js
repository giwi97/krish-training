const inputText = "india aidni"
const words = inputText.split(" ");
const fWord = words[0];
const sWord = words[1];

checkAnagram(fWord, sWord);

function checkAnagram(word1, word2){

    let wordArr1 = [...word1];
    let wordArr2 = [...word2];
    let counter = 0;


    for(let i = 0;i < word1.length;i++){

        for(let j = 0;j < word2.length;j++){

            if(wordArr1[i] == wordArr2[j]){

                counter++;
                // console.log(counter);
                // console.log(" "+wordArr1[i]+" "+wordArr2[j]);

                for(let k = 0;k <= i;k++){

                    if(wordArr1[k] == wordArr2[j]){

                        counter--;

                    }

                }

            }
            

        }

    }

    console.log(counter);

    if(counter == wordArr1.length){

        console.log("Word "+word1+" and "+word2+" are anograms..");

    }else {

        console.log("Word "+word1+" and "+word2+" are not anograms..");

    }



}