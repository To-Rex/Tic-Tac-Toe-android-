package app.test.tictoctoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var but1: Button? = null
    private var but2: Button? = null
    private var but3: Button? = null
    private var but4: Button? = null
    private var but5: Button? = null
    private var but6: Button? = null
    private var but7: Button? = null
    private var but8: Button? = null
    private var but9: Button? = null

    private var bos1 = 0
    private var bos2 = 0
    private var bos3 = 0
    private var bos4 = 0
    private var bos5 = 0
    private var bos6 = 0
    private var bos7 = 0
    private var bos8 = 0
    private var bos9 = 0

    private var index = 0
    private var index1 = 1

    @SuppressLint("CutPasteId", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but1 = findViewById(R.id.bu1)
        but2 = findViewById(R.id.bu2)
        but3 = findViewById(R.id.bu3)
        but4 = findViewById(R.id.bu4)
        but5 = findViewById(R.id.bu5)
        but6 = findViewById(R.id.bu6)
        but7 = findViewById(R.id.bu7)
        but8 = findViewById(R.id.bu8)
        but9 = findViewById(R.id.bu9)


        val switch = findViewById<Switch>(R.id.switch1)

        switch.setOnClickListener {
            if (switch.isChecked) {
                index = 1
                Toast.makeText(this@MainActivity, "$index", Toast.LENGTH_SHORT).show()
            } else {
                index = 0
                Toast.makeText(this@MainActivity, "$index", Toast.LENGTH_SHORT).show()
            }
        }

        but1?.setOnClickListener {
            if (index == 1 && index1 == 0) {
                but1!!.setBackgroundColor(R.color.purple_200)
                but1?.text = "X"
                index1 = 1
                bos1 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but1?.text = "0"
                    but1!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos1 = 2
                    chesk1()
                }
            if (index == 0) {
                but1!!.setBackgroundColor(R.color.purple_200)
                but1?.text = "X"
                bos1 = 1
                chesk()
            }
            but1?.isEnabled = false
            but1?.isClickable = false
        }

        but2?.setOnClickListener {
            if (index == 1 && index1 == 0) {
                but2!!.setBackgroundColor(R.color.purple_200)
                but2?.text = "X"
                index1 = 1
                bos2 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but2?.text = "0"
                    but2!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos2 = 2
                    chesk1()
                }
            if (index == 0) {
                but2!!.setBackgroundColor(R.color.purple_200)
                but2?.text = "X"
                bos2 = 1
                chesk()
            }


            but2?.isEnabled = false
            but2?.isClickable = false
        }

        but3?.setOnClickListener {

            if (index == 1 && index1 == 0) {
                but3!!.setBackgroundColor(R.color.purple_200)
                but3?.text = "X"
                index1 = 1
                bos3 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but3?.text = "0"
                    but3!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos3 = 2
                    chesk1()
                }
            if (index == 0) {
                but3!!.setBackgroundColor(R.color.purple_200)
                but3?.text = "X"
                bos3 = 1
                chesk()
            }
            but3?.isEnabled = false
            but3?.isClickable = false
        }

        but4?.setOnClickListener {

            if (index == 1 && index1 == 0) {
                but4!!.setBackgroundColor(R.color.purple_200)
                but4?.text = "X"
                index1 = 1
                bos4 = 1
                chesk1()

            } else
                if (index == 1 && index1 == 1) {
                    but4?.text = "0"
                    but4!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos4 = 2
                    chesk1()

                }
            if (index == 0) {
                but4!!.setBackgroundColor(R.color.purple_200)
                but4?.text = "X"
                bos4 = 1
                chesk()
            }
            but4?.isEnabled = false
            but4?.isClickable = false
        }

        but5?.setOnClickListener {
            if (index == 1 && index1 == 0) {
                but5!!.setBackgroundColor(R.color.purple_200)
                but5?.text = "X"
                index1 = 1
                bos5 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but5?.text = "0"
                    but5!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos5 = 2
                    chesk1()
                }
            if (index == 0) {
                but5!!.setBackgroundColor(R.color.purple_200)
                but5?.text = "X"
                bos5 = 1
                chesk()
            }
            but5?.isEnabled = false
            but5?.isClickable = false
        }

        but6?.setOnClickListener {

            if (index == 1 && index1 == 0) {
                but6!!.setBackgroundColor(R.color.purple_200)
                but6?.text = "X"
                index1 = 1
                bos6 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but6?.text = "0"
                    but6!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos6 = 2
                    chesk1()
                }
            if (index == 0) {
                but6!!.setBackgroundColor(R.color.purple_200)
                but6?.text = "X"
                bos6 = 1
                chesk()
            }
            but6?.isEnabled = false
            but6?.isClickable = false
        }

        but7?.setOnClickListener {

            if (index == 1 && index1 == 0) {
                but7!!.setBackgroundColor(R.color.purple_200)
                but7?.text = "X"
                index1 = 1
                bos7 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but7?.text = "0"
                    but7!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos7 = 2
                    chesk1()
                }
            if (index == 0) {
                but7!!.setBackgroundColor(R.color.purple_200)
                but7?.text = "X"
                bos7 = 1
                chesk()
            }
            but7?.isEnabled = false
            but7?.isClickable = false
        }

        but8?.setOnClickListener {
            if (index == 1 && index1 == 0) {
                but8!!.setBackgroundColor(R.color.purple_200)
                but8?.text = "X"
                index1 = 1
                bos8 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but8?.text = "0"
                    but8!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos8 = 2
                    chesk1()
                }
            if (index == 0) {
                but8!!.setBackgroundColor(R.color.purple_200)
                but8?.text = "X"
                bos8 = 1
                chesk()
            }
            but8?.isEnabled = false
            but8?.isClickable = false
        }

        but9?.setOnClickListener {
            if (index == 1 && index1 == 0) {
                but9!!.setBackgroundColor(R.color.purple_200)
                but9?.text = "X"
                index1 = 1
                bos9 = 1
                chesk1()
            } else
                if (index == 1 && index1 == 1) {
                    but9?.text = "0"
                    but9!!.setBackgroundColor(R.color.black)
                    index1 = 0
                    bos9 = 2
                    chesk1()
                }
            if (index == 0) {
                but9!!.setBackgroundColor(R.color.purple_200)
                but9?.text = "X"
                bos9 = 1
                chesk()
            }
            but9?.isEnabled = false
            but9?.isClickable = false
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun chesk() {
        for (i in 1..9) {
            if (i % 3 == 0) {
                if (bos1 == 0) {
                    but1?.setBackgroundColor(R.color.purple_200)
                    but1?.text = "O"
                    bos1 = 2
                    but1?.isEnabled = false
                    but1?.isClickable = false
                    break
                }
                if (bos2 == 0) {
                    but2?.setBackgroundColor(R.color.purple_200)
                    but2?.text = "O"
                    bos2 = 2
                    but2?.isEnabled = false
                    but2?.isClickable = false
                    break
                }
                if (bos3 == 0) {
                    but3?.setBackgroundColor(R.color.purple_200)
                    but3?.text = "O"
                    bos3 = 2
                    but3?.isEnabled = false
                    but3?.isClickable = false
                    break
                }
                if (bos4 == 0) {
                    but4?.setBackgroundColor(R.color.purple_200)
                    but4?.text = "O"
                    bos4 = 2
                    but4?.isEnabled = false
                    but4?.isClickable = false
                    break
                }
                if (bos5 == 0) {
                    but5?.setBackgroundColor(R.color.purple_200)
                    but5?.text = "O"
                    bos5 = 2
                    but5?.isEnabled = false
                    but5?.isClickable = false
                    break
                }
                if (bos6 == 0) {
                    but6?.setBackgroundColor(R.color.purple_200)
                    but6?.text = "O"
                    bos6 = 2
                    but6?.isEnabled = false
                    but6?.isClickable = false
                    break
                }
                if (bos7 == 0) {
                    but7?.setBackgroundColor(R.color.purple_200)
                    but7?.text = "O"
                    bos7 = 2
                    but7?.isEnabled = false
                    but7?.isClickable = false
                    break
                }
                if (bos8 == 0) {
                    but8?.setBackgroundColor(R.color.purple_200)
                    but8?.text = "O"
                    bos8 = 2
                    but8?.isEnabled = false
                    but8?.isClickable = false
                    break
                }
                if (bos9 == 0) {
                    but9?.setBackgroundColor(R.color.purple_200)
                    but9?.text = "O"
                    bos9 = 2
                    but9?.isEnabled = false
                    but9?.isClickable = false
                    break
                }
            }
        }
        for (l in 1..9) {
            if (bos1 == 1 && bos2 == 1 && bos3 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but2?.setBackgroundColor(android.R.color.holo_green_dark)
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos1 == 2 && bos2 == 2 && bos3 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but2?.setBackgroundColor(android.R.color.holo_green_dark)
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos4 == 1 && bos5 == 1 && bos6 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but4?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but6?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos4 == 2 && bos5 == 2 && bos6 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but4?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but6?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos7 == 1 && bos8 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                but8?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos7 == 2 && bos8 == 2 && bos9 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                but8?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos1 == 1 && bos4 == 1 && bos7 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but4?.setBackgroundColor(android.R.color.holo_green_dark)
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos1 == 2 && bos4 == 2 && bos7 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but4?.setBackgroundColor(android.R.color.holo_green_dark)
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos2 == 1 && bos5 == 1 && bos8 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but2?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but8?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos2 == 2 && bos5 == 2 && bos8 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but2?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but8?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos3 == 1 && bos6 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                but6?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos3 == 2 && bos6 == 2 && bos9 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                but6?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos1 == 1 && bos5 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos1 == 2 && bos5 == 2 && bos9 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but1?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but9?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos3 == 1 && bos5 == 1 && bos7 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
            if (bos3 == 2 && bos5 == 2 && bos7 == 2) {
                Toast.makeText(this, "O win", Toast.LENGTH_LONG).show()
                but3?.setBackgroundColor(android.R.color.holo_green_dark)
                but5?.setBackgroundColor(android.R.color.holo_green_dark)
                but7?.setBackgroundColor(android.R.color.holo_green_dark)
                reset()
                break
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun reset() {
        val handler = Handler()
        handler.postDelayed({
            bos1 = 0
            bos2 = 0
            bos3 = 0
            bos4 = 0
            bos5 = 0
            bos6 = 0
            bos7 = 0
            bos8 = 0
            bos9 = 0

            but1?.text = ""
            but2?.text = ""
            but3?.text = ""
            but4?.text = ""
            but5?.text = ""
            but6?.text = ""
            but7?.text = ""
            but8?.text = ""
            but9?.text = ""

            but1?.setBackgroundColor(R.color.white)
            but2?.setBackgroundColor(R.color.white)
            but3?.setBackgroundColor(R.color.white)
            but4?.setBackgroundColor(R.color.white)
            but5?.setBackgroundColor(R.color.white)
            but6?.setBackgroundColor(R.color.white)
            but7?.setBackgroundColor(R.color.white)
            but8?.setBackgroundColor(R.color.white)
            but9?.setBackgroundColor(R.color.white)

            but1?.isEnabled = true
            but2?.isEnabled = true
            but3?.isEnabled = true
            but4?.isEnabled = true
            but5?.isEnabled = true
            but6?.isEnabled = true
            but7?.isEnabled = true
            but8?.isEnabled = true
            but9?.isEnabled = true

            but1?.isClickable = true
            but2?.isClickable = true
            but3?.isClickable = true
            but4?.isClickable = true
            but5?.isClickable = true
            but6?.isClickable = true
            but7?.isClickable = true
            but8?.isClickable = true
            but9?.isClickable = true
        }, 2000)

    }


    @SuppressLint("ResourceAsColor")
    private fun chesk1() {
        for (l in 1..9) {
            if (bos1 == 1 && bos2 == 1 && bos3 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos1 == 2 && bos2 == 2 && bos3 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos4 == 1 && bos5 == 1 && bos6 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos4 == 2 && bos5 == 2 && bos6 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos7 == 1 && bos8 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos7 == 2 && bos8 == 2 && bos9 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos1 == 1 && bos4 == 1 && bos7 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos1 == 2 && bos4 == 2 && bos7 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos2 == 1 && bos5 == 1 && bos8 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos2 == 2 && bos5 == 2 && bos8 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos3 == 1 && bos6 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos3 == 2 && bos6 == 2 && bos9 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos1 == 1 && bos5 == 1 && bos9 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos1 == 2 && bos5 == 2 && bos9 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }

            if (bos3 == 1 && bos5 == 1 && bos7 == 1) {
                Toast.makeText(this, "X win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
            if (bos3 == 2 && bos5 == 2 && bos7 == 2) {
                Toast.makeText(this, "0 win", Toast.LENGTH_LONG).show()
                reset()
                break
            }
        }
    }
}












