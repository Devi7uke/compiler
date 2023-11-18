```mermaid
graph TD;
  style A fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style B fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style C fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style D fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style E fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style F fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style G fill:#2C3E50,stroke:#34495E,stroke-width:2px;
  style H fill:#2C3E50,stroke:#34495E,stroke-width:2px;

  A[Source Code] -->|Lexical Analysis| B[Lexical Analyzer]
  B -->|Tokens| C[Syntax Analyzer]
  C -->|Syntax Tree| D[Semantic Analyzer]
  D -->|Annotated Tree| E[Intermediate Code Generator]
  E -->|Intermediate Code| F[Code Optimizer]
  F -->|Optimized Code| G[Object Code Generator]
  G -->|Object Code| H[Executable]
