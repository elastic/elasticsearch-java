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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: xpack.usage.MlInference

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.MlInference">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInference implements JsonpSerializable {
	private final Map<String, MlInferenceIngestProcessor> ingestProcessors;

	private final MlInferenceTrainedModels trainedModels;

	@Nullable
	private final MlInferenceDeployments deployments;

	// ---------------------------------------------------------------------------------------------

	private MlInference(Builder builder) {

		this.ingestProcessors = ApiTypeHelper.unmodifiableRequired(builder.ingestProcessors, this, "ingestProcessors");
		this.trainedModels = ApiTypeHelper.requireNonNull(builder.trainedModels, this, "trainedModels");
		this.deployments = builder.deployments;

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
	 * API name: {@code deployments}
	 */
	@Nullable
	public final MlInferenceDeployments deployments() {
		return this.deployments;
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

		if (ApiTypeHelper.isDefined(this.ingestProcessors)) {
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

		if (this.deployments != null) {
			generator.writeKey("deployments");
			this.deployments.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInference}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MlInference> {
		private Map<String, MlInferenceIngestProcessor> ingestProcessors;

		private MlInferenceTrainedModels trainedModels;

		@Nullable
		private MlInferenceDeployments deployments;

		/**
		 * Required - API name: {@code ingest_processors}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ingestProcessors</code>.
		 */
		public final Builder ingestProcessors(Map<String, MlInferenceIngestProcessor> map) {
			this.ingestProcessors = _mapPutAll(this.ingestProcessors, map);
			return this;
		}

		/**
		 * Required - API name: {@code ingest_processors}
		 * <p>
		 * Adds an entry to <code>ingestProcessors</code>.
		 */
		public final Builder ingestProcessors(String key, MlInferenceIngestProcessor value) {
			this.ingestProcessors = _mapPut(this.ingestProcessors, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code ingest_processors}
		 * <p>
		 * Adds an entry to <code>ingestProcessors</code> using a builder lambda.
		 */
		public final Builder ingestProcessors(String key,
				Function<MlInferenceIngestProcessor.Builder, ObjectBuilder<MlInferenceIngestProcessor>> fn) {
			return ingestProcessors(key, fn.apply(new MlInferenceIngestProcessor.Builder()).build());
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
		 * API name: {@code deployments}
		 */
		public final Builder deployments(@Nullable MlInferenceDeployments value) {
			this.deployments = value;
			return this;
		}

		/**
		 * API name: {@code deployments}
		 */
		public final Builder deployments(
				Function<MlInferenceDeployments.Builder, ObjectBuilder<MlInferenceDeployments>> fn) {
			return this.deployments(fn.apply(new MlInferenceDeployments.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
			MlInference::setupMlInferenceDeserializer);

	protected static void setupMlInferenceDeserializer(ObjectDeserializer<MlInference.Builder> op) {

		op.add(Builder::ingestProcessors,
				JsonpDeserializer.stringMapDeserializer(MlInferenceIngestProcessor._DESERIALIZER), "ingest_processors");
		op.add(Builder::trainedModels, MlInferenceTrainedModels._DESERIALIZER, "trained_models");
		op.add(Builder::deployments, MlInferenceDeployments._DESERIALIZER, "deployments");

	}

}
