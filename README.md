# PPKWU-Lab1

Project responsible for performing operation on passed string.

Enpoint:  

Description: endpoint responsible for getting information about number of uppercase, lowercase, numbers, special characters and if contains passed substring  
Path: string/{string}/{substring} (GET)  
Params:  
    {string} - passed string   
    {substring} - passed substring   
Return: JSON object with data about passed string  

Example:  
/string/aaAA12@#/AA  

Response:  
{  
    "uppercase": 2,    
    "lowercase": 2,  
    "numbers: 2,  
    "specialChars": 2,  
    "contains": true  
}   
