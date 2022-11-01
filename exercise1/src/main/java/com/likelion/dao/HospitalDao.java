package com.likelion.dao;

import com.likelion.domain.Hospital;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class HospitalDao {

    private final JdbcTemplate jdbcTemplate;

    public HospitalDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // List<Hospital> -- 11만건 데이터
    public void add(Hospital hospital) {
        String sql = "INSERT INTO `likelion-db`.`nation_wide_hospitals` \n" +
                "(`id`, `open_service_name`, \n" +
                "`open_local_government_code`, `management_number`, \n" +
                "`license_date`, `business_status`, `business_status_code`, \n" +
                "`phone`, `full_address`, `road_name_address`, `hospital_name`, \n" +
                "`business_type_name`, `healthcare_provider_count`, \n" +
                "`patient_room_count`, `total_number_of_beds`, `total_area_size`) \n" +
                "VALUES (?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?);";
        this.jdbcTemplate.update(sql,
                hospital.getId(), hospital.getOpenServiceName(), hospital.getOpenLocalGovernmentCode(),
                hospital.getManagementNumber(), hospital.getLicenseDate(), hospital.getBusinessStatus(),
                hospital.getBusinessStatusCode(), hospital.getPhone(), hospital.getFullAddress(),
                hospital.getRoadNameAddress(), hospital.getHospitalName(), hospital.getBusinessTypeName(),
                hospital.getHealthcareProviderCount(), hospital.getPatientRoomCount(), hospital.getTotalNumberOfBeds(),
                hospital.getTotalAreaSize());
    }

}
