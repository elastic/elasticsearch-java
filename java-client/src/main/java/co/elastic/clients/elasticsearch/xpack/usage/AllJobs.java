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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.AllJobs

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.AllJobs">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllJobs implements JsonpSerializable {
	private final int count;

	private final Map<String, Integer> detectors;

	private final Map<String, String> createdBy;

	private final Map<String, Integer> modelSize;

	private final Map<String, Integer> forecasts;

	// ---------------------------------------------------------------------------------------------

	private AllJobs(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.detectors = ApiTypeHelper.unmodifiableRequired(builder.detectors, this, "detectors");
		this.createdBy = ApiTypeHelper.unmodifiableRequired(builder.createdBy, this, "createdBy");
		this.modelSize = ApiTypeHelper.unmodifiableRequired(builder.modelSize, this, "modelSize");
		this.forecasts = ApiTypeHelper.unmodifiableRequired(builder.forecasts, this, "forecasts");

	}

	public static AllJobs of(Function<Builder, ObjectBuilder<AllJobs>> fn) {
		return fn.apply(new Builder()).build();
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

		if (ApiTypeHelper.isDefined(this.detectors)) {
			generator.writeKey("detectors");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.detectors.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.createdBy)) {
			generator.writeKey("created_by");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.createdBy.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.modelSize)) {
			generator.writeKey("model_size");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.modelSize.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.forecasts)) {
			generator.writeKey("forecasts");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.forecasts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link AllJobs}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AllJobs> {
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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>detectors</code>.
		 */
		public final Builder detectors(Map<String, Integer> map) {
			this.detectors = _mapPutAll(this.detectors, map);
			return this;
		}

		/**
		 * Required - API name: {@code detectors}
		 * <p>
		 * Adds an entry to <code>detectors</code>.
		 */
		public final Builder detectors(String key, Integer value) {
			this.detectors = _mapPut(this.detectors, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code created_by}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>createdBy</code>.
		 */
		public final Builder createdBy(Map<String, String> map) {
			this.createdBy = _mapPutAll(this.createdBy, map);
			return this;
		}

		/**
		 * Required - API name: {@code created_by}
		 * <p>
		 * Adds an entry to <code>createdBy</code>.
		 */
		public final Builder createdBy(String key, String value) {
			this.createdBy = _mapPut(this.createdBy, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code model_size}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>modelSize</code>.
		 */
		public final Builder modelSize(Map<String, Integer> map) {
			this.modelSize = _mapPutAll(this.modelSize, map);
			return this;
		}

		/**
		 * Required - API name: {@code model_size}
		 * <p>
		 * Adds an entry to <code>modelSize</code>.
		 */
		public final Builder modelSize(String key, Integer value) {
			this.modelSize = _mapPut(this.modelSize, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code forecasts}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>forecasts</code>.
		 */
		public final Builder forecasts(Map<String, Integer> map) {
			this.forecasts = _mapPutAll(this.forecasts, map);
			return this;
		}

		/**
		 * Required - API name: {@code forecasts}
		 * <p>
		 * Adds an entry to <code>forecasts</code>.
		 */
		public final Builder forecasts(String key, Integer value) {
			this.forecasts = _mapPut(this.forecasts, key, value);
			return this;
		}

		@Override
		protected Builder self() {
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
