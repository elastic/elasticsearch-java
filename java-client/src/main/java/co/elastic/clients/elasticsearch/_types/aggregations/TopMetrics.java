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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopMetrics
@JsonpDeserializable
public class TopMetrics implements JsonpSerializable {
	private final List<String> sort;

	private final Map<String, String> metrics;

	// ---------------------------------------------------------------------------------------------

	private TopMetrics(Builder builder) {

		this.sort = ModelTypeHelper.unmodifiableRequired(builder.sort, this, "sort");
		this.metrics = ModelTypeHelper.unmodifiableRequired(builder.metrics, this, "metrics");

	}

	public static TopMetrics of(Function<Builder, ObjectBuilder<TopMetrics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code sort}
	 */
	public final List<String> sort() {
		return this.sort;
	}

	/**
	 * Required - API name: {@code metrics}
	 */
	public final Map<String, String> metrics() {
		return this.metrics;
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

		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (String item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.metrics.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopMetrics}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TopMetrics> {
		private List<String> sort;

		private Map<String, String> metrics;

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(List<String> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(String... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		public final Builder metrics(Map<String, String> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Builds a {@link TopMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetrics build() {
			_checkSingleUse();

			return new TopMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetrics}
	 */
	public static final JsonpDeserializer<TopMetrics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopMetrics::setupTopMetricsDeserializer, Builder::build);

	protected static void setupTopMetricsDeserializer(DelegatingDeserializer<TopMetrics.Builder> op) {

		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "sort");
		op.add(Builder::metrics, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"metrics");

	}

}
