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
**Store-Patient-Data**(name, age, vaccine_type, date, patient_list)
    for each patient in patient_list:
        if name == patient.name && age == patient.age:
            return patient.id
    Patient p = new Patient
    p.setName(name)
    p.setDOB(age)
    p.setVaccination(vaccine_type, date)
    patient_list.add(p);
~~~
>
>
>
>

The first algorithm involves taking the inputted user information and storing it. I have decided to create an object for the patient and store this object in a list. This is so the list is parsable and to be able to integrate a database should the application grow.

### 2. Generate the sample report to show how many patients are given each vaccination type, as given in Table 3 below.

**Table 3**: Vaccine type given to patients

|  ID  |  Vaccine Type  |  Count  |
|:----:| -------------- | ------- |
| 1    | AstraZeneca    | 2       |
| 2    | Pfizer         | 4       |

### 3.  Take user input then sort all patients by last name who were given the AstraZeneca/Pfizer vaccine. A sample output is shown in Table 4.

Sample - user input: 

Enter the choice of vaccine type (AstraZeneca/Pfizer): AstraZeneca

**Table 4:** Vaccine type given to patients

| Patient ID | First Name |	Last Name |	Age	| Allergy |	Vaccine Type |	   Date   |
|:----------:| ---------- | --------- |:---:|:-------:|:------------:| ---------- |
|     6      |	Bill      |	Harley    |	23  | PS80 |	AstraZeneca       |	07/21/2021|
|     5      |	Lily      |	Taylor    |	18  | PEG |	AstraZeneca       |	06/21/2021|

### 4. Give preference to patients based on age who are waiting for their next vaccination based on Table 1. A sample output is provided in Table 5.

**Table 5:** Next vaccination appointment

TABLE 5 HERE

### 5. Count the number of patients given for each allergy type based on Table 2. A sample output is provided in Table 6.

**Table 6:** Patient count based on allergy type

TABLE 6 HERE

### 6. Search, identify and list those patients who have completed three doses of vaccine as given in Table 7.

**Table 7:** Sample patient data - completed vaccine doses

TABLE 7 HERE

### 7. Search, identify and list the elderly patients (i.e. aged 70 or above) who were given fewer than three doses as given in Table 8.

**Table 8:** Sample patient data - lowest vaccine doses

TABLE 8 HERE

## **Task B:** Construct the application and implement algorithms