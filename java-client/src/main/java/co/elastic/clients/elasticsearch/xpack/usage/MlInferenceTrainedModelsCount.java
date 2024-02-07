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
import java.lang.Long;
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

// typedef: xpack.usage.MlInferenceTrainedModelsCount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceTrainedModelsCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceTrainedModelsCount implements JsonpSerializable {
	private final long total;

	private final long prepackaged;

	private final long other;

	@Nullable
	private final Long passThrough;

	@Nullable
	private final Long regression;

	@Nullable
	private final Long classification;

	@Nullable
	private final Long ner;

	@Nullable
	private final Long textEmbedding;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceTrainedModelsCount(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.prepackaged = ApiTypeHelper.requireNonNull(builder.prepackaged, this, "prepackaged");
		this.other = ApiTypeHelper.requireNonNull(builder.other, this, "other");
		this.passThrough = builder.passThrough;
		this.regression = builder.regression;
		this.classification = builder.classification;
		this.ner = builder.ner;
		this.textEmbedding = builder.textEmbedding;

	}

	public static MlInferenceTrainedModelsCount of(Function<Builder, ObjectBuilder<MlInferenceTrainedModelsCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code prepackaged}
	 */
	public final long prepackaged() {
		return this.prepackaged;
	}

	/**
	 * Required - API name: {@code other}
	 */
	public final long other() {
		return this.other;
	}

	/**
	 * API name: {@code pass_through}
	 */
	@Nullable
	public final Long passThrough() {
		return this.passThrough;
	}

	/**
	 * API name: {@code regression}
	 */
	@Nullable
	public final Long regression() {
		return this.regression;
	}

	/**
	 * API name: {@code classification}
	 */
	@Nullable
	public final Long classification() {
		return this.classification;
	}

	/**
	 * API name: {@code ner}
	 */
	@Nullable
	public final Long ner() {
		return this.ner;
	}

	/**
	 * API name: {@code text_embedding}
	 */
	@Nullable
	public final Long textEmbedding() {
		return this.textEmbedding;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("prepackaged");
		generator.write(this.prepackaged);

		generator.writeKey("other");
		generator.write(this.other);

		if (this.passThrough != null) {
			generator.writeKey("pass_through");
			generator.write(this.passThrough);

		}
		if (this.regression != null) {
			generator.writeKey("regression");
			generator.write(this.regression);

		}
		if (this.classification != null) {
			generator.writeKey("classification");
			generator.write(this.classification);

		}
		if (this.ner != null) {
			generator.writeKey("ner");
			generator.write(this.ner);

		}
		if (this.textEmbedding != null) {
			generator.writeKey("text_embedding");
			generator.write(this.textEmbedding);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceTrainedModelsCount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceTrainedModelsCount> {
		private Long total;

		private Long prepackaged;

		private Long other;

		@Nullable
		private Long passThrough;

		@Nullable
		private Long regression;

		@Nullable
		private Long classification;

		@Nullable
		private Long ner;

		@Nullable
		private Long textEmbedding;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code prepackaged}
		 */
		public final Builder prepackaged(long value) {
			this.prepackaged = value;
			return this;
		}

		/**
		 * Required - API name: {@code other}
		 */
		public final Builder other(long value) {
			this.other = value;
			return this;
		}

		/**
		 * API name: {@code pass_through}
		 */
		public final Builder passThrough(@Nullable Long value) {
			this.passThrough = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public final Builder regression(@Nullable Long value) {
			this.regression = value;
			return this;
		}

		/**
		 * API name: {@code classification}
		 */
		public final Builder classification(@Nullable Long value) {
			this.classification = value;
			return this;
		}

		/**
		 * API name: {@code ner}
		 */
		public final Builder ner(@Nullable Long value) {
			this.ner = value;
			return this;
		}

		/**
		 * API name: {@code text_embedding}
		 */
		public final Builder textEmbedding(@Nullable Long value) {
			this.textEmbedding = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceTrainedModelsCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceTrainedModelsCount build() {
			_checkSingleUse();

			return new MlInferenceTrainedModelsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceTrainedModelsCount}
	 */
	public static final JsonpDeserializer<MlInferenceTrainedModelsCount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceTrainedModelsCount::setupMlInferenceTrainedModelsCountDeserializer);

	protected static void setupMlInferenceTrainedModelsCountDeserializer(
			ObjectDeserializer<MlInferenceTrainedModelsCount.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::prepackaged, JsonpDeserializer.longDeserializer(), "prepackaged");
		op.add(Builder::other, JsonpDeserializer.longDeserializer(), "other");
		op.add(Builder::passThrough, JsonpDeserializer.longDeserializer(), "pass_through");
		op.add(Builder::regression, JsonpDeserializer.longDeserializer(), "regression");
		op.add(Builder::classification, JsonpDeserializer.longDeserializer(), "classification");
		op.add(Builder::ner, JsonpDeserializer.longDeserializer(), "ner");
		op.add(Builder::textEmbedding, JsonpDeserializer.longDeserializer(), "text_embedding");

	}

}
