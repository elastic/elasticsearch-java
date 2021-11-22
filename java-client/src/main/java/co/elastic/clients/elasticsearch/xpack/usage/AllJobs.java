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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: xpack.usage.AllJobs
@JsonpDeserializable
public class AllJobs implements JsonpSerializable {
	private final int count;

	private final Map<String, Integer> detectors;

	private final Map<String, String> createdBy;

	private final Map<String, Integer> modelSize;

	private final Map<String, Integer> forecasts;

	// ---------------------------------------------------------------------------------------------

	private AllJobs(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.detectors = ModelTypeHelper.unmodifiableRequired(builder.detectors, this, "detectors");
		this.createdBy = ModelTypeHelper.unmodifiableRequired(builder.createdBy, this, "createdBy");
		this.modelSize = ModelTypeHelper.unmodifiableRequired(builder.modelSize, this, "modelSize");
		this.forecasts = ModelTypeHelper.unmodifiableRequired(builder.forecasts, this, "forecasts");

	}

	public static AllJobs of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code detectors}
	 */
	public final Map<String, Integer> detectors() {
		return this.detectors;
	}

	/**
	 * Required - API name: {@code created_by}
	 */
	public final Map<String, String> createdBy() {
		return this.createdBy;
	}

	/**
	 * Required - API name: {@code model_size}
	 */
	public final Map<String, Integer> modelSize() {
		return this.modelSize;
	}

	/**
	 * Required - API name: {@code forecasts}
	 */
	public final Map<String, Integer> forecasts() {
		return this.forecasts;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.detectors)) {
			generator.writeKey("detectors");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.detectors.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.createdBy)) {
			generator.writeKey("created_by");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.createdBy.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.modelSize)) {
			generator.writeKey("model_size");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.modelSize.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.forecasts)) {
			generator.writeKey("forecasts");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.forecasts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllJobs}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AllJobs> {
		private Integer count;

		private Map<String, Integer> detectors;

		private Map<String, String> createdBy;

		private Map<String, Integer> modelSize;

		private Map<String, Integer> forecasts;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code detectors}
		 */
		public final Builder detectors(Map<String, Integer> value) {
			this.detectors = value;
			return this;
		}

		/**
		 * Required - API name: {@code created_by}
		 */
		public final Builder createdBy(Map<String, String> value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_size}
		 */
		public final Builder modelSize(Map<String, Integer> value) {
			this.modelSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code forecasts}
		 */
		public final Builder forecasts(Map<String, Integer> value) {
			this.forecasts = value;
			return this;
		}

		/**
		 * Builds a {@link AllJobs}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllJobs build() {
			_checkSingleUse();

			return new AllJobs(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllJobs}
	 */
	public static final JsonpDeserializer<AllJobs> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AllJobs::setupAllJobsDeserializer);

	protected static void setupAllJobsDeserializer(ObjectDeserializer<AllJobs.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::detectors, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"detectors");
		op.add(Builder::createdBy, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"created_by");
		op.add(Builder::modelSize, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"model_size");
		op.add(Builder::forecasts, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"forecasts");

	}

}
