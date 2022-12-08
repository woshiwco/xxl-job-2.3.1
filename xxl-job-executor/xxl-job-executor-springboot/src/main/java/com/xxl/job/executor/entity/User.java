package com.xxl.job.executor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * kkkkk
     */
    private Integer id;

    /**
     * ppp
     */
    private String name;

    /**
     * 
     */
    private LocalDateTime bir;

    private static final long serialVersionUID = 1L;
}