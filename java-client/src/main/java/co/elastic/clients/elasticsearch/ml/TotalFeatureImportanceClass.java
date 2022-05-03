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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TotalFeatureImportanceClass

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TotalFeatureImportanceClass">API
 *      specification</a>
 */
@JsonpDeserializable
public class TotalFeatureImportanceClass implements JsonpSerializable {
	private final String className;

	private final List<TotalFeatureImportanceStatistics> importance;

	// ---------------------------------------------------------------------------------------------

	private TotalFeatureImportanceClass(Builder builder) {

		this.className = ApiTypeHelper.requireNonNull(builder.className, this, "className");
		this.importance = ApiTypeHelper.unmodifiableRequired(builder.importance, this, "importance");

	}

	public static TotalFeatureImportanceClass of(Function<Builder, ObjectBuilder<TotalFeatureImportanceClass>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The target class value. Could be a string, boolean, or number.
	 * <p>
	 * API name: {@code class_name}
	 */
	public final String className() {
		return this.className;
	}

	/**
	 * Required - A collection of feature importance statistics related to the
	 * training data set for this particular feature.
	 * <p>
	 * API name: {@code importance}
	 */
	public final List<TotalFeatureImportanceStatistics> importance() {
		return this.importance;
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

		generator.writeKey("class_name");
		generator.write(this.className);

		if (ApiTypeHelper.isDefined(this.importance)) {
			generator.writeKey("importance");
			generator.writeStartArray();
			for (TotalFeatureImportanceStatistics item0 : this.importance) {
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
	 * Builder for {@link TotalFeatureImportanceClass}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TotalFeatureImportanceClass> {
		private String className;

		private List<TotalFeatureImportanceStatistics> importance;

		/**
		 * Required - The target class value. Could be a string, boolean, or number.
		 * <p>
		 * API name: {@code class_name}
		 */
		public final Builder className(String value) {
			this.className = value;
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>importance</code>.
		 */
		public final Builder importance(List<TotalFeatureImportanceStatistics> list) {
			this.importance = _listAddAll(this.importance, list);
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 * <p>
		 * Adds one or more values to <code>importance</code>.
		 */
		public final Builder importance(TotalFeatureImportanceStatistics value,
				TotalFeatureImportanceStatistics... values) {
			this.importance = _listAdd(this.importance, value, values);
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 * <p>
		 * Adds a value to <code>importance</code> using a builder lambda.
		 */
		public final Builder importance(
				Function<TotalFeatureImportanceStatistics.Builder, ObjectBuilder<TotalFeatureImportanceStatistics>> fn) {
			return importance(fn.apply(new TotalFeatureImportanceStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TotalFeatureImportanceClass}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalFeatureImportanceClass build() {
			_checkSingleUse();

			return new TotalFeatureImportanceClass(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalFeatureImportanceClass}
	 */
	public static final JsonpDeserializer<TotalFeatureImportanceClass> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TotalFeatureImportanceClass::setupTotalFeatureImportanceClassDeserializer);

	protected static void setupTotalFeatureImportanceClassDeserializer(
			ObjectDeserializer<TotalFeatureImportanceClass.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::importance, JsonpDeserializer.arrayDeserializer(TotalFeatureImportanceStatistics._DESERIALIZER),
				"importance");

	}

}
