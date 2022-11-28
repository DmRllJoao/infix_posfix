# infix_posfix

# Calculadora de notação INFIX para expressão POSFIXA
    
Esse é o segundo trabalho apresentado pelo profressor Inacio Cordeiro Alves na disciplina de Estrutura de dados, do curso de Ciência da Computação do Instituto Federal de Educação, Ciência e tecnologia do Estado do Ceará.

# Como se opera?

INFIXA:                                                  
A + B                                   
A + B - C                               
(A + B) * (C - D)                       
A $ B * C - D + E / F / (G + H)         
((A + B) * C - (D - E)) $ (F +G)        
A - B / (C * D $ E)                  

POSFIXA:                                                                
A B +                                   
A B + C -                           
A B + C D - *                       
A B $ C * D - E F /G H + / +        
A B + C * D E - - F G + $           
A B C D E $ * / -              

O usuário fornece uma expressão no formato de notação INFIXA e o algoritmo converte e calcula na notação POSFIXA.

Dupla: Walyson e João Victor de Melo Barros
