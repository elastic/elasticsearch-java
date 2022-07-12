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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Cpu

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Cpu">API
 *      specification</a>
 */
@JsonpDeserializable
public class Cpu implements JsonpSerializable {
	@Nullable
	private final Integer percent;

	@Nullable
	private final Time sys;

	@Nullable
	private final Long sysInMillis;

	@Nullable
	private final Time total;

	@Nullable
	private final Long totalInMillis;

	@Nullable
	private final Time user;

	@Nullable
	private final Long userInMillis;

	private final Map<String, Double> loadAverage;

	// ---------------------------------------------------------------------------------------------

	private Cpu(Builder builder) {

		this.percent = builder.percent;
		this.sys = builder.sys;
		this.sysInMillis = builder.sysInMillis;
		this.total = builder.total;
		this.totalInMillis = builder.totalInMillis;
		this.user = builder.user;
		this.userInMillis = builder.userInMillis;
		this.loadAverage = ApiTypeHelper.unmodifiable(builder.loadAverage);

	}

	public static Cpu of(Function<Builder, ObjectBuilder<Cpu>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code percent}
	 */
	@Nullable
	public final Integer percent() {
		return this.percent;
	}

	/**
	 * API name: {@code sys}
	 */
	@Nullable
	public final Time sys() {
		return this.sys;
	}

	/**
	 * API name: {@code sys_in_millis}
	 */
	@Nullable
	public final Long sysInMillis() {
		return this.sysInMillis;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final Time total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_millis}
	 */
	@Nullable
	public final Long totalInMillis() {
		return this.totalInMillis;
	}

	/**
	 * API name: {@code user}
	 */
	@Nullable
	public final Time user() {
		return this.user;
	}

	/**
	 * API name: {@code user_in_millis}
	 */
	@Nullable
	public final Long userInMillis() {
		return this.userInMillis;
	}

	/**
	 * API name: {@code load_average}
	 */
	public final Map<String, Double> loadAverage() {
		return this.loadAverage;
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

		if (this.percent != null) {
			generator.writeKey("percent");
			generator.write(this.percent);

		}
		if (this.sys != null) {
			generator.writeKey("sys");
			this.sys.serialize(generator, mapper);

		}
		if (this.sysInMillis != null) {
			generator.writeKey("sys_in_millis");
			generator.write(this.sysInMillis);

		}
		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}
		if (this.totalInMillis != null) {
			generator.writeKey("total_in_millis");
			generator.write(this.totalInMillis);

		}
		if (this.user != null) {
			generator.writeKey("user");
			this.user.serialize(generator, mapper);

		}
		if (this.userInMillis != null) {
			generator.writeKey("user_in_millis");
			generator.write(this.userInMillis);

		}
		if (ApiTypeHelper.isDefined(this.loadAverage)) {
			generator.writeKey("load_average");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.loadAverage.entrySet()) {
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
	 * Builder for {@link Cpu}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Cpu> {
		@Nullable
		private Integer percent;

		@Nullable
		private Time sys;

		@Nullable
		private Long sysInMillis;

		@Nullable
		private Time total;

		@Nullable
		private Long totalInMillis;

		@Nullable
		private Time user;

		@Nullable
		private Long userInMillis;

		@Nullable
		private Map<String, Double> loadAverage;

		/**
		 * API name: {@code percent}
		 */
		public final Builder percent(@Nullable Integer value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code sys}
		 */
		public final Builder sys(@Nullable Time value) {
			this.sys = value;
			return this;
		}

		/**
		 * API name: {@code sys}
		 */
		public final Builder sys(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.sys(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code sys_in_millis}
		 */
		public final Builder sysInMillis(@Nullable Long value) {
			this.sysInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Time value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.total(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code total_in_millis}
		 */
		public final Builder totalInMillis(@Nullable Long value) {
			this.totalInMillis = value;
			return this;
		}

		/**
		 * API name: {@code user}
		 */
		public final Builder user(@Nullable Time value) {
			this.user = value;
			return this;
		}

		/**
		 * API name: {@code user}
		 */
		public final Builder user(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.user(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code user_in_millis}
		 */
		public final Builder userInMillis(@Nullable Long value) {
			this.userInMillis = value;
			return this;
		}

		/**
		 * API name: {@code load_average}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>loadAverage</code>.
		 */
		public final Builder loadAverage(Map<String, Double> map) {
			this.loadAverage = _mapPutAll(this.loadAverage, map);
			return this;
		}

		/**
		 * API name: {@code load_average}
		 * <p>
		 * Adds an entry to <code>loadAverage</code>.
		 */
		public final Builder loadAverage(String key, Double value) {
			this.loadAverage = _mapPut(this.loadAverage, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Cpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Cpu build() {
			_checkSingleUse();

			return new Cpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Cpu}
	 */
	public static final JsonpDeserializer<Cpu> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Cpu::setupCpuDeserializer);

	protected static void setupCpuDeserializer(ObjectDeserializer<Cpu.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.integerDeserializer(), "percent");
		op.add(Builder::sys, Time._DESERIALIZER, "sys");
		op.add(Builder::sysInMillis, JsonpDeserializer.longDeserializer(), "sys_in_millis");
		op.add(Builder::total, Time._DESERIALIZER, "total");
		op.add(Builder::totalInMillis, JsonpDeserializer.longDeserializer(), "total_in_millis");
		op.add(Builder::user, Time._DESERIALIZER, "user");
		op.add(Builder::userInMillis, JsonpDeserializer.longDeserializer(), "user_in_millis");
		op.add(Builder::loadAverage, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"load_average");

	}

}
