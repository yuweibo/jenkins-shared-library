<?php
/**
 * Created by PhpStorm.
 * User: mafeifan
 * Date: 2016/06/04
 * Time: 20:23
 */

namespace mafeifan\bootboxjs;

use yii\web\AssetBundle;

class BootboxjsAsset extends AssetBundle
{
    public $sourcePath = '@mafeifan/bootboxjs/assets';

    public $js = [
        'js/bootbox.min.js',
    ];
}
