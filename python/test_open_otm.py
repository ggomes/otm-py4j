from __future__ import division
import os
import inspect
from Java_Connection import Java_Connection
import numpy as np
import time
import matplotlib.pyplot as plt
import csv

conn = Java_Connection()

if conn.pid is not None:
    sim_dt = 2.0

    this_folder = os.path.dirname(os.path.abspath(inspect.getfile(inspect.currentframe())))
    scenario_name = 'scenario'  # Scenario name
    configfile = os.path.join(this_folder, os.path.pardir, 'configfiles', scenario_name+'.xml')

    self.beats_api = conn.gateway.entry_point.get_BeATS_API()
    timestamps = self.beats_api.load(configfile, sim_dt, True, "ctm")

    # kill jvm
    conn.close()

