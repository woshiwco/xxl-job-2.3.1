package com.xxl.job.executor.entity;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@Data
public class TUser implements Serializable {
    /**
     * 
     */
    private Integer user_id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private LocalDate bir;

    private static final long serialVersionUID = 1L;
}