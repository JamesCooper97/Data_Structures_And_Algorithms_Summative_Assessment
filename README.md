# Data Structures And Algorithms Summative Assessment

## Assessment Backround/Scenario

A private hospital needs an application to manage COVID-19 vaccination records for its patients who are allergic to polyethylene glycol (PEG), polysorbate 80 (PS80) or gelatin. A member of the hospital staff enters the patient’s basic information, such as their name, age and allergy, and decides which vaccine (AstraZeneca or Pfizer) is suitable, based on Table 2. The staff member then injects the selected vaccine and enters the information in the system. The system generates a report based on the patient’s allergy, as shown in Table 1.

**Table 1**: Sample hospital data

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Date   |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ---------- |
|     1      |	Georgia   |	Roberts   |	23  | Gelatin |	Pfizer       |	06/15/2021|
|     2      |	Charlie   |	Smith     |	40  | Gelatin |	Pfizer       |	06/15/2021|
|     3      |	Mariam    |	Dawson    |	27  | Gelatin |	Pfizer       |	06/17/2021|
|     4      |	Emmett    |	Miller    |	30  | Gelatin |	Pfizer       |	06/20/2021|
|     5      |	Lily      |	Taylor    |	18  |   PEG   |	AstraZeneca  |	06/21/2021|
|     6      |	Bill      |	Harley    |	70  |  PS80   |	AstraZeneca  |	07/21/2021|
|     3      |	Mariam    |	Dawson    |	27  | Gelatin |	Pfizer       |	07/17/2021|
|     4      |	Emmett    |	Miller    |	30  | Gelatin |	Pfizer       |	07/20/2021|
|     3      |	Mariam    |	Dawson    |	27  | Gelatin |	Pfizer       |	08/19/2021|


## **Task A** - Write Pseudocode for the tasks given below

### 1. Store collected user input data (i.e. name, age, vaccine type and date) based on initial check-up in an appropiate data structure. Sample data provided in Table 1. Store sample data on the different allergies and recommended vaccine types in an appropriate data structure. Sample data is provided in Table 2.

Points to consider. Returning patient. Invalid input data.
~~~
class Patient
    
    
~~~   
~~~
StorePatientData(name, age, vaccine_type, date, patient_list)
    for each patient in patient_list:
        if name == patient.name && age == patient.age:
            return patient.id
    Patient p = new Patient
    p.setName(name)
    p.setDOB(age)
    p.setVaccination(vaccine_type, date)
    patient_list.add(p);
~~~

The first algorithm involves taking the inputted user information and storing it. I have decided to create an object for the patient and store this object in a list. This is so the list is parsable and to be able to integrate a database should the application grow.

### 2. Generate the sample report to show how many patients are given each vaccination type, as given in Table 3 below.

**Table 3**: Vaccine type given to patients

|  ID  |  Vaccine Type  |  Count  |
|:----:| -------------- | ------- |
| 1    | AstraZeneca    | 2       |
| 2    | Pfizer         | 4       |

~~~
class Vaccine
    Integer IDSeed = 0; //initial id given to first created value will increase with each subsequently created Vaccine
    Integer ID;
    VaccineType vaccineType; //Taken from enum and has possible values PFizer or AstraZeneca
    Declare integer doseCount

    Vaccine(vaccineType){
        vaccineType = vaccineType
        ID = IDSeed
        IDSeed++;
    }

    //Has methods
    increaseDose():
        doseCount++;
~~~
~~~
VaccineCount(VaccineTypes, DoseList)
    for each VaccineType in VaccineTypes List:
        for each Dose in DoseList:
            if VaccineType = Dose.vaccineType:
                Vaccine.increaseDose()
//The number of doses of a particular vaccine can now be retrieved from the vaccine object            
~~~

### 3.  Take user input then sort all patients by last name who were given the AstraZeneca/Pfizer vaccine. A sample output is shown in Table 4.

Sample - user input: 

Enter the choice of vaccine type (AstraZeneca/Pfizer): AstraZeneca

**Table 4:** Vaccine type given to patients

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Date   |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ---------- |
|     6      |	Bill      |	Harley    |	70  |  PS80   |	AstraZeneca  |	07/21/2021|
|     5      |	Lily      |	Taylor    |	18  |   PEG   |	AstraZeneca  |	06/21/2021|

~~~
SortLastName(Patients, VaccineType)
    N = Patients.length
    Initilise FinalPatientsArray
    for I=1 to N-1
        if patient.VaccineType is VaccineType
            FinalPatientsArray add Patient
    P = FinalPatientsArray.length
    for j=1 to P-1
        key = FinalPatientsArray[j].lastName
        k = j-1

        while(k>=0 && (FinalPatientsArray[k].lastName compare with key))
            FinalPatientArray[k + 1] = FinalPatientArray[k]
            k = k - 1
        
        FinalPatientArray[K+1] = key
~~~

An algorithm that takes all the Patients with the selected vaccinetype and then sorts them using insertion sort.

### 4. Give preference to patients based on age who are waiting for their next vaccination based on Table 1. A sample output is provided in Table 5.

**Table 5:** Next vaccination appointment

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Date   |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ---------- |
|     6      |	Bill      |	Harley    |	70  |  PS80   |	AstraZeneca  |	07/21/2021|
|     2      |	Charlie   |	Smith     |	40  | Gelatin |	Pfizer       |	06/15/2021|
|     4      |	Emmett    |	Miller    |	30  | Gelatin |	Pfizer       |	06/20/2021|
|     3      |	Mariam    |	Dawson    |	27  | Gelatin |	Pfizer       |	06/17/2021|
|     1      |	Georgia   |	Roberts   |	23  | Gelatin |	Pfizer       |	06/15/2021|
|     5      |	Lily      |	Taylor    |	18  |   PEG   |	AstraZeneca  |	06/21/2021|

~~~
SortByAge(Patients)
    N = Patients.length

    for i = N/2-1 to i>0 increment -1              //For loop counting down
        CreateMaxHeap(Patients,i,0)
        
    
    for i = N-1 to 0 increment -1                       //For loop counting down
        Patients[i], Patients[0] = Patients[0], Patients[i]     //Swap elements
        CreateMaxHeap(Patients,i,0)
    
    return Patients

CreateMaxHeap(Patients,N,i)
            root = i                                    //Initialise position i as root
            leftNodeIndex = 2*i+1                       //Initialise left node index
            rightNodeIndex = 2*i+2                      //Initialise right node index

            if leftNodeIndex < N and Patients[root].age < Patients[leftNodeIndex].age:
                root = leftNodeIndex
        
            if rightNodeIndex<N and Patients[root].age < Patients[rightNodeIndex].age:
                root = rightNodeIndex

            if root!=i:
                Patients[i], Patients[root] = Patients[root], Patients[i]    //Swap elements
                heapify(Patients,N,root)    
~~~

### 5. Count the number of patients given for each allergy type based on Table 2. A sample output is provided in Table 6.

**Table 6:** Patient count based on allergy type

|  Allergy Type  |  Total no. of patients  |
| -------------- | ------- |
| PEG    | 2       |
| PS80         | 4       |
| Gelatin         | 4       |

~~~
AllergyCount(Patients, Allergies)
    for allergy in Allergies
    declare allergy.count=0;
        for patient in Patients
            if patient.allergy = allergy
                allergy.addCount;
    return Allergies
~~~

### 6. Search, identify and list those patients who have completed three doses of vaccine as given in Table 7.

**Table 7:** Sample patient data - completed vaccine doses

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Dose     |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ----------   |
|     6      |	Bill      |	Harley    |	70  |  PS80   |	AstraZeneca  |	3           |

~~~
ThreeDoses(Patient,Doses)
    for Patient in Patients
    Declare list threeDoses                         //Declares an empty list for patients with 3 doses
    count = 0
        for dose in doses
            if dose.patientID is equal to patient.id
            count++
        if count = 3
            threeDoses add patient
    return threeDoses
~~~

### 7. Search, identify and list the elderly patients (i.e. aged 70 or above) who were given fewer than three doses as given in Table 8.

**Table 8:** Sample patient data - lowest vaccine doses

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Dose     |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ----------   |
|     6      |	Bill      |	Harley    |	70  |  PS80   |	AstraZeneca  |	1           |

~~~
ElderlyDoses(Patient,Doses)
    for Patient in Patients
        Declare list elderlyDoses                         //Declares an empty list for patients with 3 doses
        count = 0
        if Patient.age >= 70
            for dose in doses
                if dose.patientID is equal to patient.id
                count++
            if count < 3
                elderlyDoses add patient
    return elderlyDoses
~~~

## **Task B:** Construct the application and implement algorithms

**1.** Develop a single Java program that follows coding conventions and enables the user to search, sort, count and provide list of patients waiting for their next vaccination appointments by using algorithms studied in this module, which are run from the command line. The application should be text-based and menu-driven.

**2.** Implement all the algorithms you have created for Task A.
Note: 
●	You need to ensure that the user input is validated, and feedback is given when an invalid input is entered.
●	Test all the implemented algorithms you have created for Task A.
