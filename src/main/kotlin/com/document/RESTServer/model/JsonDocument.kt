package com.document.RESTServer.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.io.Serializable
import java.sql.Date

@Data
@NoArgsConstructor
@AllArgsConstructor
object JsonDocument: Serializable {
 var first_name: String = ""
 var patronymic_name: String = ""
 var last_name: String = ""
 var birth_date: Date = Date(946684800) //2000-01-01
 var sex: String = ""
 var work_place: String = ""
 var position: String = ""
 lateinit var address: Address
 var city = ""
 lateinit var social_affiliation: SocialAffiliation
 lateinit var population_category: PopulationCategory
 var is_decreed_group: Boolean = false
 lateinit var last_FG_date: LastFGSurvey
 lateinit var last_FG_place: PlaceOfFGSurvey
 var date_of_first_medical_treatment: Date = Date(946684800) //2000-01-01
 var date_of_registration_of_antituberculous_inst: Date = Date(946684800) //2000-01-01
 lateinit var disease_detection: DiseaseDetection
 lateinit var disease_type: DiseaseType
 lateinit var detection_method_of_antituberculous: DetectionMethodOfAntituberculous
 var diagnosis: String = ""
 lateinit var icd_code: ICDCode
 var is_decay_present: Boolean = false
 var is_bacterial_confirmed: Boolean = false
 lateinit var detection_method_of_bacteria: DetectionMethodOfBacteria
 lateinit var concomitant_disease: ConcomitantDiseases
 var is_registered_in_clinic: Boolean = false
 var date_of_cvcc_diagnosis_confirmed: Date = Date(946684800) //2000-01-01
 var doctor_name: String = ""
 var date_of_notification: Date = Date(946684800) //2000-01-01
}

@Data
@NoArgsConstructor
@AllArgsConstructor
object Address: Serializable {
 var district = ""
 var street = ""
 var house = ""
 var building = ""
 var square = ""

}

enum class Sex(val num: Int) {
 FEMALE(1),
 MALE(2)
}

enum class SocialAffiliation(val num: Int) {
 WORKER(1),
 EMPLOYEE(2),
 STUDENT(3),
 DISABLED_PERSON(4),
 PRESCHOOL_CHILD_DDU(5),
 UNORGANIZED_PRESCHOOL_CHILD(6),
 PENSIONER(7),
 NON_WORKING_PERSON(8),
 UNEMPLOYED(9)
}

enum class PopulationCategory(val num: Int) {
 RESIDENT_OF_TERRITORY(1),
 RESIDENT_OF_ANOTHER_TERRITORY(2),
 IMMIGRANT(3),
 CONVICTED(4),
 RENAMED(5),
 HOMELESS(6),
 OTHER(7),
 FOREIGN_CITIZEN(8),
 GVT_PROTECTION(9)
}

enum class LastFGSurvey(val num: Int) {
 UP_TO_ONE_YEAR(1),
 ONE_TO_TWO_YEARS(2),
 THREE_TO_FIVE_YEARS(3),
 MORE_THAN_FIVE_YEARS(4)
}

enum class PlaceOfFGSurvey(val num: Int) {
 CLINIC(1),
 HOSPITAL(2),
 SOCIAL_PROTECTION(3),
 TB_FACILITY(4),
 ANOTHER_AGENCY(5)
}

enum class DiseaseDetection(val num: Int) {
 FILING_COMPLAINTS(1),
 ACTIVE_DETECTION(2),
 POST_MORTEM(3)
}

enum class DiseaseType(val num: Int) {
 ZERO(1),
 III(2),
 IV(3),
 IIIA(4),
 VIA(5),
 VIB(6),
 VIV(7)
}

enum class DetectionMethodOfAntituberculous(val num: Int) {
 ZIL_NELSON_MICROSCOPY(1),
 LUMINESCENT_MICROSCOPY(2),
 SEEDING(3),
 FLUOROGRAPHY(4),
 RADIOGRAPHY(5),
 TUBERCULIN_DIAGNOSTICS(6),
 HISTOLOGY(7),
 OTHER(8)
}

enum class ICDCode(val num: Int) {
 TUBERCULOSIS_LUNGS(1),
 TUBERCULOSIS_PLEURA_ETC(2),
 EXTRAPULMONARY_TUBERCULOSIS(1),

}

enum class DetectionMethodOfBacteria(val num: Int) {
 ZIL_NELSON_MICROSCOPY(1),
 LUMINESCENT_MICROSCOPY(2),
 SEEDING(3),
}

enum class ConcomitantDiseases(val num: Int) {
 NONE(1),
 SAKHARN_DIABETES(2),
 HNZL(3),
 HYPERTONUM_DISEASE_CHD(4),
 ULCERATIVE_COLITIS_OF_GEL(5),
 MENTAL_ILLNESS(6),
 ONCOLOGICAL_DISEASE(7),
 OTHER(8)
}
