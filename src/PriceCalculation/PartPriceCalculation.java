package PriceCalculation;

public class PartPriceCalculation {

    //下模部件
    private int self_lubricating_slide_A; //自润滑滑板A
    private int lifting_lug_A; //吊耳A
    private int limit_bolt; //行程限位螺栓
    private int locating_key_A; //定位键
    private int guide_pillar_A; //导柱A
    private int guide_pillar_fixation_plate; //导柱固定板
    private int stopper; //挡键
    private int guide_sleeve; //导套
    private int guide_sleeve_anti_loose; //导套防松脱固定块
    private int storage_block; //存放块
    private int shock_absorber_PU; //聚氨酯吸震组件
    private int material_guide_roller; //材料导辊组件
    private int pressing_plate_A; //压板A
    private int material_guide_block_A; //材料导向块A
    private int material_guide_block_B; //材料导向块B
    private int spring; //弹簧

    //下PAD/B/D/H部件
    private int bearer_supporting_bracket; //PAD到底垫块
    private int coiledMaterial_feedstock_leadingTruck; //卷材进料导向架
    private int square_lubricatingSubstance_bracket; //方形滑料托架
    private int balance_bearer_supporting_bracket; //平衡垫块
    private int check_switch; //投入检测开关
    private int locating_key_B; //定位键
    private int locating_appliance; //定位具

    //上PAD部件
    private int limit_bolt_bush_A; //限位螺栓衬套A
    private int limit_bolt_bush_B; //限位螺栓衬套B
    private int guide_pillar_B; //导柱B
    private int guide_pillar_bush; //导柱衬套
    private int self_lubricating_slide_B; //自润滑滑板B
    private int side_pin; //侧销

    //上模部件
    private int guide_sleeve_A; //导套A
    private int guide_sleeve_B; //导套B
    private int guide_sleeve_fixation_gasket; //导套固定垫圈
    private int pole; //先行杆
    private int spring_guided_retainer; //弹簧导向保持器
    private int NO2_spring_A; //氮气弹簧A
    private int NO2_spring_bearer_supporting_bracket_A; //氮气弹簧垫块A
    private int spring_A; //弹簧
    private int springLoaded_plunger; //弹簧柱塞
    private int self_lubricating_slide_C; //自润滑滑板C
    private int mint_mark; //刻印
    private int mark_tags; //刻印标记
    private int lifting_pin; //顶料销
    private int die_spacing_cable_buckle; //凹模定距索结扣
    private int lifting_lug_B; //吊耳B

    //斜模部件
    private int inclined_model_guide; //斜模型导料器
    private int roller_handling_device; //辊式搬运装置
    private int standard_CAM; //标准CAM
    private int self_lubricating_slide_D; //自润滑滑板D
    private int pressing_plate_B; //压板B
    private int central_pressing_plate; //中心压板
    private int safety_screw; //安全螺钉
    private int convex_VSlide; //凸V形滑板
    private int concave_VSlide; //凹V形滑板
    private int NO2_spring_B; //氮气弹簧B
    private int NO2_spring_bearer_supporting_bracket_B; //氮气弹簧垫块B
    private int force_pull_back_hook; //强制拉回钩
    private int stop_block; //限位块

    //冲孔部件
    private int puncher_pin; //冲头
    private int puncher_pin_mounting; //冲头固定座
    private int punch_bushing; //冲孔衬套

    //气动，电器部件
    private int inductor; //感应器
    private int quick_connector; //快插接头
    private int terminal_transfer_box; //端子转接盒
    private int circuit_connector; //电路接头
    private int air_cylinder; //气缸
    private int plug; //接头
    private int set_header; //集管座
    private int compensated_flow_control_valve; //调速阀

    private double sum = 0;

    public PartPriceCalculation(int self_lubricating_slide_A, int lifting_lug_A, int limit_bolt, int locating_key_A, int guide_pillar_A, int guide_pillar_fixation_plate, int stopper, int guide_sleeve, int guide_sleeve_anti_loose, int storage_block, int shock_absorber_PU, int material_guide_roller, int pressing_plate_A, int material_guide_block_A, int material_guide_block_B, int spring, int bearer_supporting_bracket, int coiledMaterial_feedstock_leadingTruck, int square_lubricatingSubstance_bracket, int balance_bearer_supporting_bracket, int check_switch, int locating_key_B, int locating_appliance, int limit_bolt_bush_A, int limit_bolt_bush_B, int guide_pillar_B, int guide_pillar_bush, int self_lubricating_slide_B, int side_pin, int guide_sleeve_A, int guide_sleeve_B, int guide_sleeve_fixation_gasket, int pole, int spring_guided_retainer, int NO2_spring_A, int NO2_spring_bearer_supporting_bracket_A, int spring_A, int springLoaded_plunger, int self_lubricating_slide_C, int mint_mark, int mark_tags, int lifting_pin, int die_spacing_cable_buckle, int lifting_lug_B, int inclined_model_guide, int roller_handling_device, int standard_CAM, int self_lubricating_slide_D, int pressing_plate_B, int central_pressing_plate, int safety_screw, int convex_VSlide, int concave_VSlide, int NO2_spring_B, int NO2_spring_bearer_supporting_bracket_B, int force_pull_back_hook, int stop_block, int puncher_pin, int puncher_pin_mounting, int punch_bushing, int inductor, int quick_connector, int terminal_transfer_box, int circuit_connector, int air_cylinder, int plug, int set_header, int compensated_flow_control_valve) {
        this.self_lubricating_slide_A = self_lubricating_slide_A;
        this.lifting_lug_A = lifting_lug_A;
        this.limit_bolt = limit_bolt;
        this.locating_key_A = locating_key_A;
        this.guide_pillar_A = guide_pillar_A;
        this.guide_pillar_fixation_plate = guide_pillar_fixation_plate;
        this.stopper = stopper;
        this.guide_sleeve = guide_sleeve;
        this.guide_sleeve_anti_loose = guide_sleeve_anti_loose;
        this.storage_block = storage_block;
        this.shock_absorber_PU = shock_absorber_PU;
        this.material_guide_roller = material_guide_roller;
        this.pressing_plate_A = pressing_plate_A;
        this.material_guide_block_A = material_guide_block_A;
        this.material_guide_block_B = material_guide_block_B;
        this.spring = spring;
        this.bearer_supporting_bracket = bearer_supporting_bracket;
        this.coiledMaterial_feedstock_leadingTruck = coiledMaterial_feedstock_leadingTruck;
        this.square_lubricatingSubstance_bracket = square_lubricatingSubstance_bracket;
        this.balance_bearer_supporting_bracket = balance_bearer_supporting_bracket;
        this.check_switch = check_switch;
        this.locating_key_B = locating_key_B;
        this.locating_appliance = locating_appliance;
        this.limit_bolt_bush_A = limit_bolt_bush_A;
        this.limit_bolt_bush_B = limit_bolt_bush_B;
        this.guide_pillar_B = guide_pillar_B;
        this.guide_pillar_bush = guide_pillar_bush;
        this.self_lubricating_slide_B = self_lubricating_slide_B;
        this.side_pin = side_pin;
        this.guide_sleeve_A = guide_sleeve_A;
        this.guide_sleeve_B = guide_sleeve_B;
        this.guide_sleeve_fixation_gasket = guide_sleeve_fixation_gasket;
        this.pole = pole;
        this.spring_guided_retainer = spring_guided_retainer;
        this.NO2_spring_A = NO2_spring_A;
        this.NO2_spring_bearer_supporting_bracket_A = NO2_spring_bearer_supporting_bracket_A;
        this.spring_A = spring_A;
        this.springLoaded_plunger = springLoaded_plunger;
        this.self_lubricating_slide_C = self_lubricating_slide_C;
        this.mint_mark = mint_mark;
        this.mark_tags = mark_tags;
        this.lifting_pin = lifting_pin;
        this.die_spacing_cable_buckle = die_spacing_cable_buckle;
        this.lifting_lug_B = lifting_lug_B;
        this.inclined_model_guide = inclined_model_guide;
        this.roller_handling_device = roller_handling_device;
        this.standard_CAM = standard_CAM;
        this.self_lubricating_slide_D = self_lubricating_slide_D;
        this.pressing_plate_B = pressing_plate_B;
        this.central_pressing_plate = central_pressing_plate;
        this.safety_screw = safety_screw;
        this.convex_VSlide = convex_VSlide;
        this.concave_VSlide = concave_VSlide;
        this.NO2_spring_B = NO2_spring_B;
        this.NO2_spring_bearer_supporting_bracket_B = NO2_spring_bearer_supporting_bracket_B;
        this.force_pull_back_hook = force_pull_back_hook;
        this.stop_block = stop_block;
        this.puncher_pin = puncher_pin;
        this.puncher_pin_mounting = puncher_pin_mounting;
        this.punch_bushing = punch_bushing;
        this.inductor = inductor;
        this.quick_connector = quick_connector;
        this.terminal_transfer_box = terminal_transfer_box;
        this.circuit_connector = circuit_connector;
        this.air_cylinder = air_cylinder;
        this.plug = plug;
        this.set_header = set_header;
        this.compensated_flow_control_valve = compensated_flow_control_valve;
    }

    /**
     * 各部件单价计算
     */
    public void numOfPartCalculation(){

        //下模部件单价计算
        double price_self_lubricating_slide_A = self_lubricating_slide_A * 107.3125;
        double price_lifting_lug_A = lifting_lug_A * 100; //未有单价
        double price_limit_bolt = limit_bolt * 93.7857;
        double price_locating_key_A = locating_key_A * 100; //未有单价
        double price_guide_pillar_A = guide_pillar_A * 187;
        double price_guide_pillar_fixation_plate = guide_pillar_fixation_plate * 100; //未有单价
        double price_stopper = stopper * 100; //未有单价
        double price_guide_sleeve = guide_sleeve * 133;
        double price_guide_sleeve_anti_loose = guide_sleeve_anti_loose * 100; //*
        double price_storage_block = storage_block * 100; //*
        double price_shock_absorber_PU = shock_absorber_PU * 100; //*
        double price_material_guide_roller = material_guide_roller * 100; //*
        double price_pressing_plate_A = pressing_plate_A * 100; //*
        double price_material_guide_block_A = material_guide_block_A * 100; //*
        double price_material_guide_block_B = material_guide_block_B * 100; //*
        double price_spring = spring * 18;

        //下PAD/B/D/H部件
        double price_bearer_supporting_bracket = bearer_supporting_bracket * 100; //*
        double price_coiledMaterial_feedstock_leadingTruck = coiledMaterial_feedstock_leadingTruck * 100; //*
        double price_square_lubricatingSubstance_bracket = square_lubricatingSubstance_bracket * 100; //*
        double price_balance_bearer_supporting_bracket = balance_bearer_supporting_bracket * 100; //*
        double price_check_switch = check_switch * 100; //*
        double price_locating_key_B = locating_key_B * 100; //*
        double price_locating_appliance = locating_appliance * 505;

        //上PAD部件
        double price_limit_bolt_bush_A = limit_bolt_bush_A * 100;//*
        double price_limit_bolt_bush_B = limit_bolt_bush_B * 100; //*
        double price_guide_pillar_B = guide_pillar_B * 187;
        double price_guide_pillar_bush = guide_pillar_bush * 100; //*
        double price_self_lubricating_slide_B = self_lubricating_slide_B * 105.33;
        double price_side_pin = side_pin * 85;

        //上模部件
        double price_guide_sleeve_A = guide_sleeve_A * 133;
        double price_guide_sleeve_B = guide_sleeve_B * 133;
        double price_guide_sleeve_fixation_gasket = guide_sleeve_fixation_gasket * 100; //*
        double price_pole = pole * 100; //*
        double price_spring_guided_retainer = spring_guided_retainer * 100; //*//弹簧导向保持器
        double price_NO2_spring_A = NO2_spring_A * 381;
        double price_NO2_spring_bearer_supporting_bracket_A = NO2_spring_bearer_supporting_bracket_A * 100; //*
        double price_spring_A = spring_A * 18;
        double price_springLoaded_plunger = springLoaded_plunger * 34.2;
        double price_self_lubricating_slide_C = self_lubricating_slide_C * 105.33;
        double price_mint_mark = mint_mark * 100; //*
        double price_mark_tags = mark_tags * 100; //*
        double price_lifting_pin = lifting_pin * 621;
        double price_die_spacing_cable_buckle = die_spacing_cable_buckle * 105;
        double price_lifting_lug_B = lifting_lug_B * 100; //*

        //斜模部件
        double price_inclined_model_guide = inclined_model_guide * 100; //*
        double price_roller_handling_device = roller_handling_device * 100; //*
        double price_standard_CAM = standard_CAM * 100; //*
        double price_self_lubricating_slide_D = self_lubricating_slide_D * 105.33;
        double price_pressing_plate_B = pressing_plate_B * 100; //*
        double price_central_pressing_plate = central_pressing_plate * 100; //*
        double price_safety_screw = safety_screw * 100; //*
        double price_convex_VSlide = convex_VSlide * 100; //*
        double price_concave_VSlide = concave_VSlide * 100; //*
        double price_NO2_spring_B = NO2_spring_B * 381;
        double price_NO2_spring_bearer_supporting_bracket_B = NO2_spring_bearer_supporting_bracket_B * 100; //*
        double price_force_pull_back_hook = force_pull_back_hook * 100; //*
        double price_stop_block = stop_block * 82.6;

        //冲孔部件
        double price_puncher_pin = puncher_pin * 140;
        double price_puncher_pin_mounting = puncher_pin_mounting * 100; //*
        double price_punch_bushing = punch_bushing * 100; //*

        //气动，电器部件
        double price_inductor = inductor * 100; //*
        double price_quick_connector = quick_connector * 100; //*
        double price_terminal_transfer_box = terminal_transfer_box * 100; //*
        double price_circuit_connector = circuit_connector * 100; //*
        double price_air_cylinder = air_cylinder * 100; //*
        double price_plug = plug * 54;
        double price_set_header = set_header * 100; //*
        double price_compensated_flow_control_valve = compensated_flow_control_valve * 100; //*

        sum = price_self_lubricating_slide_A + price_lifting_lug_A + price_limit_bolt + price_locating_key_A + price_guide_pillar_A
                + price_guide_pillar_fixation_plate + price_stopper + price_guide_sleeve + price_guide_sleeve_anti_loose
                + price_storage_block + price_shock_absorber_PU + price_material_guide_roller + price_pressing_plate_A + price_material_guide_block_A
                + price_material_guide_block_B + price_spring + price_bearer_supporting_bracket + price_coiledMaterial_feedstock_leadingTruck
                + price_square_lubricatingSubstance_bracket + price_balance_bearer_supporting_bracket + price_check_switch + price_locating_key_B
                + price_locating_appliance + price_limit_bolt_bush_A + price_limit_bolt_bush_B + price_guide_pillar_B + price_guide_pillar_bush
                + price_self_lubricating_slide_B + price_side_pin + price_guide_sleeve_A + price_guide_sleeve_B + price_guide_sleeve_fixation_gasket
                + price_pole + price_spring_guided_retainer + price_NO2_spring_A + price_NO2_spring_bearer_supporting_bracket_A + price_spring_A
                + price_springLoaded_plunger + price_self_lubricating_slide_C + price_mint_mark + price_mark_tags + price_lifting_pin + price_die_spacing_cable_buckle
                + price_lifting_lug_B + price_inclined_model_guide + price_roller_handling_device + price_standard_CAM + price_self_lubricating_slide_D
                + price_pressing_plate_B + price_central_pressing_plate + price_safety_screw + price_convex_VSlide + price_concave_VSlide + price_NO2_spring_B
                + price_NO2_spring_bearer_supporting_bracket_B + price_force_pull_back_hook + price_stop_block + price_puncher_pin + price_puncher_pin_mounting
                + price_punch_bushing + price_inductor + price_quick_connector + price_terminal_transfer_box + price_circuit_connector + price_air_cylinder
                + price_plug + price_set_header + price_compensated_flow_control_valve;

    }

    public double getSum() {
        return sum;
    }
}
