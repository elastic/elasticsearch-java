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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Boolean;
import java.util.List;
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

// typedef: indices._types.DataStreamLifecycle

/**
 * Data stream lifecycle denotes that a data stream is managed by the data
 * stream lifecycle and contains the configuration.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamLifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycle implements JsonpSerializable {
	@Nullable
	private final Time dataRetention;

	private final List<DownsamplingRound> downsampling;

	@Nullable
	private final SamplingMethod downsamplingMethod;

	@Nullable
	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected DataStreamLifecycle(AbstractBuilder<?> builder) {

		this.dataRetention = builder.dataRetention;
		this.downsampling = ApiTypeHelper.unmodifiable(builder.downsampling);
		this.downsamplingMethod = builder.downsamplingMethod;
		this.enabled = builder.enabled;

	}

	public static DataStreamLifecycle dataStreamLifecycleOf(Function<Builder, ObjectBuilder<DataStreamLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If defined, every document added to this data stream will be stored at least
	 * for this time frame. Any time after this duration the document could be
	 * deleted. When empty, every document in this data stream will be stored
	 * indefinitely.
	 * <p>
	 * API name: {@code data_retention}
	 */
	@Nullable
	public final Time dataRetention() {
		return this.dataRetention;
	}

	/**
	 * The list of downsampling rounds to execute as part of this downsampling
	 * configuration
	 * <p>
	 * API name: {@code downsampling}
	 */
	public final List<DownsamplingRound> downsampling() {
		return this.downsampling;
	}

	/**
	 * The method used to downsample the data. There are two options
	 * <code>aggregate</code> and <code>last_value</code>. It requires
	 * <code>downsampling</code> to be defined. Defaults to <code>aggregate</code>.
	 * <p>
	 * API name: {@code downsampling_method}
	 */
	@Nullable
	public final SamplingMethod downsamplingMethod() {
		return this.downsamplingMethod;
	}

	/**
	 * If defined, it turns data stream lifecycle on/off
	 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
	 * lifecycle that's disabled (enabled: <code>false</code>) will have no effect
	 * on the data stream.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
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

		if (this.dataRetention != null) {
			generator.writeKey("data_retention");
			this.dataRetention.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.downsampling)) {
			generator.writeKey("downsampling");
			generator.writeStartArray();
			for (DownsamplingRound item0 : this.downsampling) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.downsamplingMethod != null) {
			generator.writeKey("downsampling_method");
			this.downsamplingMethod.serialize(generator, mapper);
		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycle}.
	 */

	public static class Builder extends DataStreamLifecycle.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataStreamLifecycle> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycle build() {
			_checkSingleUse();

			return new DataStreamLifecycle(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Time dataRetention;

		@Nullable
		private List<DownsamplingRound> downsampling;

		@Nullable
		private SamplingMethod downsamplingMethod;

		@Nullable
		private Boolean enabled;

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final BuilderT dataRetention(@Nullable Time value) {
			this.dataRetention = value;
			return self();
		}

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final BuilderT dataRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.dataRetention(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The list of downsampling rounds to execute as part of this downsampling
		 * configuration
		 * <p>
		 * API name: {@code downsampling}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>downsampling</code>.
		 */
		public final BuilderT downsampling(List<DownsamplingRound> list) {
			this.downsampling = _listAddAll(this.downsampling, list);
			return self();
		}

		/**
		 * The list of downsampling rounds to execute as part of this downsampling
		 * configuration
		 * <p>
		 * API name: {@code downsampling}
		 * <p>
		 * Adds one or more values to <code>downsampling</code>.
		 */
		public final BuilderT downsampling(DownsamplingRound value, DownsamplingRound... values) {
			this.downsampling = _listAdd(this.downsampling, value, values);
			return self();
		}

		/**
		 * The list of downsampling rounds to execute as part of this downsampling
		 * configuration
		 * <p>
		 * API name: {@code downsampling}
		 * <p>
		 * Adds a value to <code>downsampling</code> using a builder lambda.
		 */
		public final BuilderT downsampling(Function<DownsamplingRound.Builder, ObjectBuilder<DownsamplingRound>> fn) {
			return downsampling(fn.apply(new DownsamplingRound.Builder()).build());
		}

		/**
		 * The method used to downsample the data. There are two options
		 * <code>aggregate</code> and <code>last_value</code>. It requires
		 * <code>downsampling</code> to be defined. Defaults to <code>aggregate</code>.
		 * <p>
		 * API name: {@code downsampling_method}
		 */
		public final BuilderT downsamplingMethod(@Nullable SamplingMethod value) {
			this.downsamplingMethod = value;
			return self();
		}

		/**
		 * If defined, it turns data stream lifecycle on/off
		 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
		 * lifecycle that's disabled (enabled: <code>false</code>) will have no effect
		 * on the data stream.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final BuilderT enabled(@Nullable Boolean value) {
			this.enabled = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycle}
	 */
	public static final JsonpDeserializer<DataStreamLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycle::setupDataStreamLifecycleDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataStreamLifecycleDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::dataRetention, Time._DESERIALIZER, "data_retention");
		op.add(AbstractBuilder::downsampling, JsonpDeserializer.arrayDeserializer(DownsamplingRound._DESERIALIZER),
				"downsampling");
		op.add(AbstractBuilder::downsamplingMethod, SamplingMethod._DESERIALIZER, "downsampling_method");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
