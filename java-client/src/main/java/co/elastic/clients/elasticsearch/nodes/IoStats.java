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

package co.elastic.clients.elasticsearch.nodes;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IoStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.IoStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class IoStats implements JsonpSerializable {
	private final List<IoStatDevice> devices;

	@Nullable
	private final IoStatDevice total;

	// ---------------------------------------------------------------------------------------------

	private IoStats(Builder builder) {

		this.devices = ApiTypeHelper.unmodifiable(builder.devices);
		this.total = builder.total;

	}

	public static IoStats of(Function<Builder, ObjectBuilder<IoStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code devices}
	 */
	public final List<IoStatDevice> devices() {
		return this.devices;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final IoStatDevice total() {
		return this.total;
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

		if (ApiTypeHelper.isDefined(this.devices)) {
			generator.writeKey("devices");
			generator.writeStartArray();
			for (IoStatDevice item0 : this.devices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IoStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IoStats> {
		@Nullable
		private List<IoStatDevice> devices;

		@Nullable
		private IoStatDevice total;

		/**
		 * API name: {@code devices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>devices</code>.
		 */
		public final Builder devices(List<IoStatDevice> list) {
			this.devices = _listAddAll(this.devices, list);
			return this;
		}

		/**
		 * API name: {@code devices}
		 * <p>
		 * Adds one or more values to <code>devices</code>.
		 */
		public final Builder devices(IoStatDevice value, IoStatDevice... values) {
			this.devices = _listAdd(this.devices, value, values);
			return this;
		}

		/**
		 * API name: {@code devices}
		 * <p>
		 * Adds a value to <code>devices</code> using a builder lambda.
		 */
		public final Builder devices(Function<IoStatDevice.Builder, ObjectBuilder<IoStatDevice>> fn) {
			return devices(fn.apply(new IoStatDevice.Builder()).build());
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable IoStatDevice value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(Function<IoStatDevice.Builder, ObjectBuilder<IoStatDevice>> fn) {
			return this.total(fn.apply(new IoStatDevice.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IoStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IoStats build() {
			_checkSingleUse();

			return new IoStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IoStats}
	 */
	public static final JsonpDeserializer<IoStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IoStats::setupIoStatsDeserializer);

	protected static void setupIoStatsDeserializer(ObjectDeserializer<IoStats.Builder> op) {

		op.add(Builder::devices, JsonpDeserializer.arrayDeserializer(IoStatDevice._DESERIALIZER), "devices");
		op.add(Builder::total, IoStatDevice._DESERIALIZER, "total");

	}

}
