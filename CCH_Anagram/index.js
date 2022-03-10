const inputText = "listen sieent"
const words = inputText.split(" ");
const fWord = words[0];
const sWord = words[1];

console.log("Words are: "+fWord+" and "+sWord);

if(fWord.length == sWord.length){

    checkAnagram(fWord, sWord);

}else{

    console.log("Word "+fWord+" and "+sWord+" are not anograms..")

}



function checkAnagram(word1, word2){

    let wordArr1 = [...word1];
    let wordArr2 = [...word2];
    let counter = 0;
    let trigger = 0;


    for(let i = 0;i < word1.length;i++){

        for(let j = 0;j < word2.length;j++){

            if(wordArr1[i] == wordArr2[j]){

                counter++;
                trigger++;

                if(trigger != 1){
                    counter--;
                    trigger = 1;

                }
                

            }

            
            

        }
        trigger = 0;

    }



    if(counter == wordArr1.length){

        console.log("Word "+word1+" and "+word2+" are anograms..");

    }else {

        console.log("Word "+word1+" and "+word2+" are not anograms..");

    }



}