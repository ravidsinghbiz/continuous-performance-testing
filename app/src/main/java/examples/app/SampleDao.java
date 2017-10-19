package examples.app;

import java.util.Collection;

public interface SampleDao
{
  Sample newSample(String name);

  Sample updateSample(Sample sample);

  Sample getSample(Long id);

  Sample deleteSample(Long id);

  Collection<Sample> getSamples();
}
