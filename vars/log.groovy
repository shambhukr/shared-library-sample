def info(message){
    echo "Info: ${message}"
    def props = readJSON file: "${WORKSPACE}/input.json"
    assert props['fruit'] == 'Apple'
    assert props.size == 'Large'
    assert props.color == 'Green' : "Color should be Red"
}

def warning(message){

    echo "Warning: ${message}"
}

def greeting(){

    echo "greeting"
    def message = "Hi There"
    return message 
}
