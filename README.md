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

# Forming a fuzzy set by determining categories, the universe of discourse, and the domain of input and output variables.
Determining the membership function using the shoulder shape, which is the area located in the middle of a variable represented in the form of a triangle, not limited to using shoulder-shaped graphs, but can utilize other graph shapes according to the conditions of the specified variables.

Shoulder Graph:

![gambar](https://github.com/user-attachments/assets/3cce7374-f1e8-48e3-bd2d-ab32aab5d89a)

The shoulder-shaped membership function for each input variable in the assessment of services such as Learning, Administration, Infrastructure, Library, and Student Affairs to be studied is as follows:

1. BR has a value of 1 if it is in the range of 0-30 and a value of 0 if it is at a value of 60.
2. CK has a value of 0 if it is at a value of 30 and a value of 1 if it is at a value of 60. CK also has a value of 0 if it is at a value of 90.
3. SB has a value of 0 if it is at a value of 60 and will have a value of 1 if it is in the range of 90-100.

After obtaining the membership function for each membership set, the next step is to convert it into Matrices A and B. Matrix A will contain the maximum membership degree values from each variable assessment set. Matrix B will contain the membership degree values of the total variable. 

Performing calculations for Auto Associative Fuzzy Hebbian FAM using Correlation-Product Encoding, and conducting the composition relation using Max Product Composition.

# Result
Insert data to app:
![Hasil Core](https://github.com/user-attachments/assets/cc31f371-cf3e-4e2d-81dc-204f72af97f4)

Process the data:
![jur](https://github.com/user-attachments/assets/bfbb556d-22a2-4e4f-bf61-4e05b353b8dc)


