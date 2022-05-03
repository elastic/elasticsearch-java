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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceFeatureImportance

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.InferenceFeatureImportance">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceFeatureImportance implements JsonpSerializable {
	private final String featureName;

	@Nullable
	private final Double importance;

	private final List<InferenceClassImportance> classes;

	// ---------------------------------------------------------------------------------------------

	private InferenceFeatureImportance(Builder builder) {

		this.featureName = ApiTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.importance = builder.importance;
		this.classes = ApiTypeHelper.unmodifiable(builder.classes);

	}

	public static InferenceFeatureImportance of(Function<Builder, ObjectBuilder<InferenceFeatureImportance>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * API name: {@code importance}
	 */
	@Nullable
	public final Double importance() {
		return this.importance;
	}

	/**
	 * API name: {@code classes}
	 */
	public final List<InferenceClassImportance> classes() {
		return this.classes;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		if (this.importance != null) {
			generator.writeKey("importance");
			generator.write(this.importance);

		}
		if (ApiTypeHelper.isDefined(this.classes)) {
			generator.writeKey("classes");
			generator.writeStartArray();
			for (InferenceClassImportance item0 : this.classes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceFeatureImportance}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferenceFeatureImportance> {
		private String featureName;

		@Nullable
		private Double importance;

		@Nullable
		private List<InferenceClassImportance> classes;

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * API name: {@code importance}
		 */
		public final Builder importance(@Nullable Double value) {
			this.importance = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>classes</code>.
		 */
		public final Builder classes(List<InferenceClassImportance> list) {
			this.classes = _listAddAll(this.classes, list);
			return this;
		}

		/**
		 * API name: {@code classes}
		 * <p>
		 * Adds one or more values to <code>classes</code>.
		 */
		public final Builder classes(InferenceClassImportance value, InferenceClassImportance... values) {
			this.classes = _listAdd(this.classes, value, values);
			return this;
		}

		/**
		 * API name: {@code classes}
		 * <p>
		 * Adds a value to <code>classes</code> using a builder lambda.
		 */
		public final Builder classes(
				Function<InferenceClassImportance.Builder, ObjectBuilder<InferenceClassImportance>> fn) {
			return classes(fn.apply(new InferenceClassImportance.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceFeatureImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceFeatureImportance build() {
			_checkSingleUse();

			return new InferenceFeatureImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceFeatureImportance}
	 */
	public static final JsonpDeserializer<InferenceFeatureImportance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceFeatureImportance::setupInferenceFeatureImportanceDeserializer);

	protected static void setupInferenceFeatureImportanceDeserializer(
			ObjectDeserializer<InferenceFeatureImportance.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::importance, JsonpDeserializer.doubleDeserializer(), "importance");
		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(InferenceClassImportance._DESERIALIZER),
				"classes");

	}

}
