function calculateAttribute(Attribute){
    var diceRoll = [4];
    var attributeValue = 0;

    for (let i = 0; i < 4; i++) {
        diceRoll[i] = Math.floor(Math.random() * 6);
    }

    diceRoll.sort(function (first, second) {
        return first - second;
    });

    for (let i = 0; i < 3; i++) {
        attributeValue += diceRoll[i];
    }

    Attribute.value = attributeValue;

    return attributeValue;

}