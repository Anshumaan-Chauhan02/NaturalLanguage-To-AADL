<h2 align='center'><b> Toward Generating System Architecture and Formal Functional Description in the Architecture Analysis & Design Language (AADL) With Structured Natural Language </b></h2>

<h4 align='center'> Project Description </h4> 
Model based engineering has enabled automated analytical reasoning early in the design phase. As a result, inconsistencies and design errors can be captured early in the development lifecycle. But there is still a gap in the natural language-based specifications and its actual implementation. This is because the formal method-based tools utilize mathematical principles and theories of computation that require specific skills, thus reducing the usability of model-based engineering. Natural language is the most widely used method to represent specifications. So, it is intuitive to utilize natural language-based representation to generate system and formal annotations such that it will enable automated architectural analysis with much wider acceptance leading to a much broader impact. In our paper we focus on designing the above-mentioned approach that integrates representation of the specifications in a subset of English language which can then be used to generate system architecture in Architecture Analysis and Design Language along with the generation of functional specifications. We illustrate our approach by validating it with use cases from the aerospace and electromechanical domains. <br><br>
Paper link : https://asmedigitalcollection.asme.org/IDETC-CIE/proceedings-abstract/IDETC-CIE2022/86212/V002T02A077/1150294
<br>

### Technical Skills 
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Jupyter Notebook](https://img.shields.io/badge/jupyter-%23FA0F00.svg?style=for-the-badge&logo=jupyter&logoColor=white)

### File Description and Content 
* src/data/ : This folder contains all the English language inputs used for the testing of the system
* src/lib/ : Contains all the jar files and the compiler files (Lexer, Parser and Visitor)
* src/main/GrammarVerifier.java : Verifies whether the input text is according to the syntax
* src/main/Main.java : Execution file that takes the input file and generates the AADL code as an output
* src/main/Visitor.java : Compiler that does the conversion of parsed text input to corresponding AADL code 
