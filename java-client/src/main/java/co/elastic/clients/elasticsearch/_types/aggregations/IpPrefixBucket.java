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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.IpPrefixBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.IpPrefixBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpPrefixBucket extends MultiBucketBase {
	private final boolean isIpv6;

	private final String key;

	private final int prefixLength;

	@Nullable
	private final String netmask;

	// ---------------------------------------------------------------------------------------------

	private IpPrefixBucket(Builder builder) {
		super(builder);

		this.isIpv6 = ApiTypeHelper.requireNonNull(builder.isIpv6, this, "isIpv6");
		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");
		this.prefixLength = ApiTypeHelper.requireNonNull(builder.prefixLength, this, "prefixLength");
		this.netmask = builder.netmask;

	}

	public static IpPrefixBucket of(Function<Builder, ObjectBuilder<IpPrefixBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code is_ipv6}
	 */
	public final boolean isIpv6() {
		return this.isIpv6;
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final String key() {
		return this.key;
	}

	/**
	 * Required - API name: {@code prefix_length}
	 */
	public final int prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code netmask}
	 */
	@Nullable
	public final String netmask() {
		return this.netmask;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("is_ipv6");
		generator.write(this.isIpv6);

		generator.writeKey("key");
		generator.write(this.key);

		generator.writeKey("prefix_length");
		generator.write(this.prefixLength);

		if (this.netmask != null) {
			generator.writeKey("netmask");
			generator.write(this.netmask);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpPrefixBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpPrefixBucket> {
		private Boolean isIpv6;

		private String key;

		private Integer prefixLength;

		@Nullable
		private String netmask;

		/**
		 * Required - API name: {@code is_ipv6}
		 */
		public final Builder isIpv6(boolean value) {
			this.isIpv6 = value;
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(String value) {
			this.key = value;
			return this;
		}

		/**
		 * Required - API name: {@code prefix_length}
		 */
		public final Builder prefixLength(int value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code netmask}
		 */
		public final Builder netmask(@Nullable String value) {
			this.netmask = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpPrefixBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpPrefixBucket build() {
			_checkSingleUse();

			return new IpPrefixBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpPrefixBucket}
	 */
	public static final JsonpDeserializer<IpPrefixBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpPrefixBucket::setupIpPrefixBucketDeserializer);

	protected static void setupIpPrefixBucketDeserializer(ObjectDeserializer<IpPrefixBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::isIpv6, JsonpDeserializer.booleanDeserializer(), "is_ipv6");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::netmask, JsonpDeserializer.stringDeserializer(), "netmask");

	}

}
