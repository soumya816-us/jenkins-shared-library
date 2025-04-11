def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "329599629534"
        case 'qa':
            return "329599629534"
        case 'uat':
            return "329599629534"
        case 'pre-prod':
            return "329599629534"
        case 'prod':
            return "329599629534"
        default:
            return "nothing"
    } 
}