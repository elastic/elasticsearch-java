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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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

// typedef: _global.search._types.RescoreProfileBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.RescoreProfileBase">API
 *      specification</a>
 */

public abstract class RescoreProfileBase implements JsonpSerializable {
	private final String description;

	private final long timeInNanos;

	@Nullable
	private final Time time;

	private final Map<String, JsonData> debug;

	// ---------------------------------------------------------------------------------------------

	protected RescoreProfileBase(AbstractBuilder<?> builder) {

		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.timeInNanos = ApiTypeHelper.requireNonNull(builder.timeInNanos, this, "timeInNanos", 0);
		this.time = builder.time;
		this.debug = ApiTypeHelper.unmodifiable(builder.debug);

	}

	/**
	 * Required - What the rescorer runs.
	 * <p>
	 * API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The total time spent in the rescorer, including the time spent
	 * running its queries.
	 * <p>
	 * API name: {@code time_in_nanos}
	 */
	public final long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * The time spent in the rescorer, in human-readable units. Only returned when
	 * <code>human</code> is <code>true</code>.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final Time time() {
		return this.time;
	}

	/**
	 * Extra details about the rescorer.
	 * <p>
	 * Every rescorer reports <code>window_size</code>, the number of top documents
	 * it was configured to rescore. <code>timed_out</code> is set to
	 * <code>true</code> if the search timed out while the rescorer was running.
	 * Rescorers can add their own keys.
	 * <p>
	 * API name: {@code debug}
	 */
	public final Map<String, JsonData> debug() {
		return this.debug;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos);

		if (this.time != null) {
			generator.writeKey("time");
			this.time.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.debug)) {
			generator.writeKey("debug");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.debug.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String description;

		private Long timeInNanos;

		@Nullable
		private Time time;

		@Nullable
		private Map<String, JsonData> debug;

		/**
		 * Required - What the rescorer runs.
		 * <p>
		 * API name: {@code description}
		 */
		public final BuilderT description(String value) {
			this.description = value;
			return self();
		}

		/**
		 * Required - The total time spent in the rescorer, including the time spent
		 * running its queries.
		 * <p>
		 * API name: {@code time_in_nanos}
		 */
		public final BuilderT timeInNanos(long value) {
			this.timeInNanos = value;
			return self();
		}

		/**
		 * The time spent in the rescorer, in human-readable units. Only returned when
		 * <code>human</code> is <code>true</code>.
		 * <p>
		 * API name: {@code time}
		 */
		public final BuilderT time(@Nullable Time value) {
			this.time = value;
			return self();
		}

		/**
		 * The time spent in the rescorer, in human-readable units. Only returned when
		 * <code>human</code> is <code>true</code>.
		 * <p>
		 * API name: {@code time}
		 */
		public final BuilderT time(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.time(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Extra details about the rescorer.
		 * <p>
		 * Every rescorer reports <code>window_size</code>, the number of top documents
		 * it was configured to rescore. <code>timed_out</code> is set to
		 * <code>true</code> if the search timed out while the rescorer was running.
		 * Rescorers can add their own keys.
		 * <p>
		 * API name: {@code debug}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>debug</code>.
		 */
		public final BuilderT debug(Map<String, JsonData> map) {
			this.debug = _mapPutAll(this.debug, map);
			return self();
		}

		/**
		 * Extra details about the rescorer.
		 * <p>
		 * Every rescorer reports <code>window_size</code>, the number of top documents
		 * it was configured to rescore. <code>timed_out</code> is set to
		 * <code>true</code> if the search timed out while the rescorer was running.
		 * Rescorers can add their own keys.
		 * <p>
		 * API name: {@code debug}
		 * <p>
		 * Adds an entry to <code>debug</code>.
		 */
		public final BuilderT debug(String key, JsonData value) {
			this.debug = _mapPut(this.debug, key, value);
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(RescoreProfileBase instance) {
			this.description = instance.description;
			this.timeInNanos = instance.timeInNanos;
			this.time = instance.time;
			this.debug = instance.debug;

		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRescoreProfileBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(AbstractBuilder::time, Time._DESERIALIZER, "time");
		op.add(AbstractBuilder::debug, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "debug");

	}

}
