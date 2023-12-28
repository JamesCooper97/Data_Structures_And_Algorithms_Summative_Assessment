## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


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


## Task A - Write Pseudocode for the tasks given below

### 1. Store collected user input data (i.e. name, age, vaccine type and date) based on initial check-up in an appropiate data structure. Sample data provided in Table 1. Store sample data on the different allergies and recommended vaccine types in an appropriate data structure. Sample data is provided in Table 2.

> **store_patient_data(name, age, vaccine type, date)
>       
>
>
>
>
>
>
>
>
>
>

The first algorithm involves taking 

### 2. Generate the sample report to show how many patients are given each vaccination type, as given in Table 3 below.

**Table 3**: Vaccine type given to patients

|  ID  |  Vaccine Type  |  Count  |
|:----:| -------------- | ------- |
| 1    | AstraZeneca    | 2       |
| 2    | Pfizer         | 4       |
