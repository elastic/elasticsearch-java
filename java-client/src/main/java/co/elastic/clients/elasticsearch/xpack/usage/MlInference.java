/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlInference
@JsonpDeserializable
public class MlInference implements JsonpSerializable {
	private final Map<String, MlInferenceIngestProcessor> ingestProcessors;

	private final MlInferenceTrainedModels trainedModels;

	// ---------------------------------------------------------------------------------------------

	private MlInference(Builder builder) {

		this.ingestProcessors = ModelTypeHelper.unmodifiableRequired(builder.ingestProcessors, this,
				"ingestProcessors");
		this.trainedModels = ModelTypeHelper.requireNonNull(builder.trainedModels, this, "trainedModels");

	}

	public static MlInference of(Function<Builder, ObjectBuilder<MlInference>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code ingest_processors}
	 */
	public final Map<String, MlInferenceIngestProcessor> ingestProcessors() {
		return this.ingestProcessors;
	}

	/**
	 * Required - API name: {@code trained_models}
	 */
	public final MlInferenceTrainedModels trainedModels() {
		return this.trainedModels;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.ingestProcessors)) {
			generator.writeKey("ingest_processors");
			generator.writeStartObject();
			for (Map.Entry<String, MlInferenceIngestProcessor> item0 : this.ingestProcessors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("trained_models");
		this.trainedModels.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInference}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlInference> {
		private Map<String, MlInferenceIngestProcessor> ingestProcessors;

		private MlInferenceTrainedModels trainedModels;

		/**
		 * Required - API name: {@code ingest_processors}
		 */
		public final Builder ingestProcessors(Map<String, MlInferenceIngestProcessor> value) {
			this.ingestProcessors = value;
			return this;
		}

		/**
		 * Set {@link #ingestProcessors(Map)} to a singleton map.
		 */
		public Builder ingestProcessors(String key,
				Function<MlInferenceIngestProcessor.Builder, ObjectBuilder<MlInferenceIngestProcessor>> fn) {
			return this.ingestProcessors(
					Collections.singletonMap(key, fn.apply(new MlInferenceIngestProcessor.Builder()).build()));
		}

		public final Builder ingestProcessors(
				Function<MapBuilder<String, MlInferenceIngestProcessor, MlInferenceIngestProcessor.Builder>, ObjectBuilder<Map<String, MlInferenceIngestProcessor>>> fn) {
			return ingestProcessors(fn.apply(new MapBuilder<>(MlInferenceIngestProcessor.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code trained_models}
		 */
		public final Builder trainedModels(MlInferenceTrainedModels value) {
			this.trainedModels = value;
			return this;
		}

		/**
		 * Required - API name: {@code trained_models}
		 */
		public final Builder trainedModels(
				Function<MlInferenceTrainedModels.Builder, ObjectBuilder<MlInferenceTrainedModels>> fn) {
			return this.trainedModels(fn.apply(new MlInferenceTrainedModels.Builder()).build());
		}

		/**
		 * Builds a {@link MlInference}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInference build() {
			_checkSingleUse();

			return new MlInference(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInference}
	 */
	public static final JsonpDeserializer<MlInference> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MlInference::setupMlInferenceDeserializer, Builder::build);

	protected static void setupMlInferenceDeserializer(DelegatingDeserializer<MlInference.Builder> op) {

		op.add(Builder::ingestProcessors,
				JsonpDeserializer.stringMapDeserializer(MlInferenceIngestProcessor._DESERIALIZER), "ingest_processors");
		op.add(Builder::trainedModels, MlInferenceTrainedModels._DESERIALIZER, "trained_models");

	}

}
