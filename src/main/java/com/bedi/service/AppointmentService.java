package com.bedi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bedi.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
