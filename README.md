# Fuzzy Associative Memory App
Application for Calculating Satisfaction Level Using the Fuzzy Associative Memory (FAM) Method

The Fuzzy Associative Memory (FAM) method was first published by Bart Kosko. FAM is a system that maps one fuzzy set to another fuzzy set. FAM is a fuzzy version of Bidirectional Associative Memory. Simply put, FAM maps a fuzzy rule or a set of pairs (Ai,Bj)(Ai​,Bj​) that connects the fuzzy set BjBj​ to the fuzzy set AiAi​. A FAM system can consist of several different sets of FAM pairs: (A1,B1)(A1​,B1​), (A2,B2)(A2​,B2​), ... (AP,BP)(AP​,BP​).

![Algoritma FAM](https://github.com/user-attachments/assets/afb9ed15-175c-4f3a-815e-999f7c38af45)

FAM Algorithm :
1. Encode the input and output into the FAM matrix (Ai,Bi)∣0≤i<m(Ai​,Bi​)∣0≤i<m where mm is the number of data.
2. Calculate the Auto Associative Fuzzy Hebbian FAM Matrix using one of two learning rules, either correlation-minimum encoding or correlation-product encoding.
3. Once the value of MM is obtained, the value of BB can be found by performing the composition relation of AA and MM. We can also find the value of AA by performing the composition relation of BB and MM. The composition relation can be carried out using Max-Min Composition or Max-Product Composition.
4. Suppose a FAM system contains mm different FAM groups, namely (A1,B1),(A2,B2),…,(Am,Bm)(A1​,B1​),(A2​,B2​),…,(Am​,Bm​). Using the Hebb learning rule, mm FAM matrices M1,M2,…,MmM1​,M2​,…,Mm​ will be obtained. The Fuzzy Hebbian used to encode the mm FAM matrices (M1,M2,…,Mm)(M1​,M2​,…,Mm​) is either correlation-minimum encoding or correlation-product encoding.
5. Perform Defuzzification using Winner Take All or Weighted Average.
