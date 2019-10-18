package io.avec.treestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by avec112 on 17.10.19.
 */
@Getter
@AllArgsConstructor
@ToString
public class Bataljon implements Enhet {
    private String name;
    private String sjef;
}
